package com.example.ems.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {

    Integer employeeId;

    String name;

    BigDecimal salary;

    String address;

    BigDecimal phone;

    BigDecimal Accountno;



}
