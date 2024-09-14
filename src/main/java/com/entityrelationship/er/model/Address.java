package com.entityrelationship.er.model;
/*
 * @Author: Devraj Kannan
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String state;

    @OneToOne
    @JoinColumn(name = "empId")
    private Employee employee;
}
