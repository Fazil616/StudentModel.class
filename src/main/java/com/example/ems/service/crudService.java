package com.example.ems.service;

import com.example.ems.dao.crudDao;
import com.example.ems.entity.Employee;
import com.example.ems.entity.Student;
import com.example.ems.entity.crud;
import com.example.ems.model.crud.crudModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class crudService {

    @Autowired
    public crudDao cruddao;
    public crud savecrud(crudModel crudModel) {
        crud cruD = new crud();
        cruD.setCrudid(crudModel.getId());
        cruD.setEmail(crudModel.getEmail());
        cruD.setMobile(crudModel.getMobile());
        cruD.setPassword(crudModel.getPassword());
        cruddao.save(cruD);
        return cruD;
    }
    public List<crud> getList(){
        List<crud> crud= cruddao.findAll();


        return crud;
    }

}