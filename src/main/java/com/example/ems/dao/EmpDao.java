package com.example.ems.dao;

import com.example.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDao extends JpaRepository<Employee,Integer> {
    Employee findByEmployeeId(Integer employeeId) ;

    @Override
    List<Employee> findAllById(Iterable<Integer> integers);
}