package com.example.ems.dao;

import com.example.ems.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {


  Student findByStudentId(Integer studentId) ;
}