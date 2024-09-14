package com.entityrelationship.er.model;
/*
 * @Author: Devraj Kannan
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  default "GenerationType.SEQUENCE" creates new table with suffix "_seq" will be created
    private int id;

    @Column(nullable = false)
    private String name;


    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    @ManyToMany
    @JoinTable(name = "employee-mission",
            joinColumns = @JoinColumn(name = "employeeId"),  //Primarykey of the employee table
            inverseJoinColumns = @JoinColumn(name = "missionId") //Primarykey of the mission table
            )
    private List<Mission> mission;
}
