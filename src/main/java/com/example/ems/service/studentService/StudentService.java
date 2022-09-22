package com.example.ems.service.studentService;


import com.example.ems.dao.StudentDao;
import com.example.ems.entity.Student;
import com.example.ems.model.Student.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentDao studentDao;

    public Student saveStudent(StudentModel studentModel) {
        Student student = new Student();
        student.setStudentId(studentModel.getStudentId());
        student.setName(studentModel.getName());
        student.setRollno(studentModel.getRollno());
        student.setTotal(studentModel.getTotal());
        student.setGrade(studentModel.getGrade());
        studentDao.save(student);
        return student;
    }

    public List<Student> getList() {
        List<Student> students = studentDao.findAll();


        return students;
    }

    ;

    public Student getbyid(Integer id) {

        Student students = studentDao.findByStudentId(id);
        StudentModel studentModel= new StudentModel();
        studentModel.setStudentId(students.getStudentId());
        studentModel.setName(students.getName());
        studentModel.setRollno(students.getRollno());
        studentModel.setTotal(students.getTotal());
        studentModel.setGrade(students.getGrade());
                return students;

    }

    public Student deletebyid(Integer id) {

        Student students = studentDao.findByStudentId(id);
        studentDao.delete(students);
        return students;

    }
}
