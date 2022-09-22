package com.example.ems.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

    Integer studentId;

    String name;

    Integer rollno;

    BigDecimal total;

    String grade;

}

