package com.example.ems.controller;

import com.example.ems.entity.crud;
import com.example.ems.model.crud.crudModel;
import com.example.ems.service.crudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/crud")
public class  crudController {
    @Autowired
    public crudService crudservice;

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@ModelAttribute crudModel crudModel) {
        crud crud = crudservice.savecrud(crudModel);
        return new ResponseEntity<>(crud, HttpStatus.OK);
    }

    @GetMapping(value = "/getList")
    public ResponseEntity<?> getAll() {
        List<crud> crud = crudservice.getList();
        return new ResponseEntity<>(crud, HttpStatus.OK);
    }
}