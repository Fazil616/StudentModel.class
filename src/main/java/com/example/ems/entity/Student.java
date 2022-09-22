package com.example.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Basic
    @Column(name = "Student_Id")
    Integer studentId;

    @Basic
    @Column(name="Student_name")
    String name;

    @Basic
    @Column(name="Student_rollno")
    Integer rollno;

    @Basic
    @Column(name="Student_total")
    BigDecimal total;


   @Basic
   @Column(name="Student_Grade")
   String grade;


}


