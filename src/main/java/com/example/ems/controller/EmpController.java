package com.example.ems.controller;

import com.example.ems.entity.Employee;
import com.example.ems.model.Employee.EmployeeModel;
import com.example.ems.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmpController {
    @Autowired
    public EmsService emsService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@ModelAttribute EmployeeModel employeeModel){
        Employee employee= emsService.saveEmployee(employeeModel);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @GetMapping (value = "/getList")
    public ResponseEntity<?> getAll(){
        List<Employee> employee= emsService.getList();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @GetMapping(value = "getbyid")
    public  ResponseEntity<?> getbyid(@RequestParam Integer id) {
       Employee employee = emsService.getbyid(id);
        return new ResponseEntity<>( employee,HttpStatus.OK);
    }
    @PostMapping(value="/deleteEmployee")
    public Boolean deleteEmployee(@RequestParam Integer employeeId) {
        Employee employee = emsService.deletebyid(employeeId);

        return true;
    }
    @PostMapping(value="/update")
    public Employee update(@ModelAttribute EmployeeModel employeeModel) {
        return emsService.saveEmployee(employeeModel);
    }
}
