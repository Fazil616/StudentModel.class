package com.example.ems.controller;

import com.example.ems.entity.Student;
import com.example.ems.model.Student.StudentModel;
import com.example.ems.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    public StudentService studentService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@ModelAttribute StudentModel studentModel){
        Student student= studentService.saveStudent(studentModel);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping(value = "/getList")
    public ResponseEntity<?> getAll(){
        List<Student> student= studentService.getList();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

 @GetMapping(value = "/getbyid")
    public  ResponseEntity<Student> getbyid(@RequestParam Integer studentId){
        Student student =  studentService.getbyid(studentId);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }


    @PostMapping(value="/deleteStudent")
    public Boolean deleteStudent(@RequestParam Integer studentId) {
        Student student = studentService.deletebyid(studentId);

        return true;
    }
}

