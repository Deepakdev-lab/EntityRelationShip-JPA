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
@Table(name = "mission")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // if we dont provide strategy then new table with suffx "_seq" will be created default "GenerationType.SEQUENCE"
    private int id;
    private String name;
    private int period;

    @ManyToMany(mappedBy = "mission")
    private List<Employee> employee;
}
