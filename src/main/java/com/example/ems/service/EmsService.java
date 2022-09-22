package com.example.ems.service;

import com.example.ems.dao.EmpDao;
import com.example.ems.entity.Employee;
import com.example.ems.model.Employee.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmsService {
    @Autowired
    public EmpDao empDao;

    public Employee saveEmployee(EmployeeModel employeeModel){
        Employee employee=new Employee();
        if(employeeModel.getEmployeeId() != null) {
            employee.setEmployeeId(employeeModel.getEmployeeId());
        }
        employee.setName(employeeModel.getName());
     employee.setSalary(employeeModel.getSalary());
     employee.setAddress(employeeModel.getAddress());
     employee.setPhone(employeeModel.getPhone());
     //   employee.setAccountno(employeeModel.getAccountno());
               empDao.save(employee);
        return employee;
    }
    public List<Employee> getList(){
        List<Employee> employee= empDao.findAll();


        return employee;
    }

    public Employee getbyid (Integer id){
        Employee employee = empDao.findByEmployeeId(id);
        return employee;
    }
    public Employee deletebyid(Integer id) {

        Employee employee = empDao.findByEmployeeId(id);
        empDao.delete(employee);
        return employee;

    }
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = empDao.findByEmployeeId(employee.getEmployeeId());
        existingEmployee.setName(employee.getName());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setPhone(employee.getPhone());
        return empDao.save(existingEmployee);
    }
}
