package com.example.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EMPLOYEE")
@TableGenerator(name = "INCREMENT_INITIAL_VALUE", initialValue = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
   // @Basic
    @Column(name = "Employee_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer employeeId;

    @Basic
    @Column(name="Employee_name")
    String name;

    @Basic
    @Column(name="Employee_salary")
    BigDecimal salary;

    @Basic
    @Column(name="Employee_Address")
    String address;


    @Basic
    @Column(name="Employee_Phone")
    BigDecimal phone;

   /* @Basic
    @Column
    BigDecimal Accountno; */




}
