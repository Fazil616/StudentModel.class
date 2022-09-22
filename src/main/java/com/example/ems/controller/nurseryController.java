package com.example.ems.controller;

import com.example.ems.entity.nursery;
import com.example.ems.model.nursery.nurseryModel;
import com.example.ems.service.nurseryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/nursery")
public class  nurseryController {
    @Autowired
    public nurseryService nurseryService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@ModelAttribute nurseryModel nurseryModel){
        nursery nursery= nurseryService.savenursery(nurseryModel);
        return new ResponseEntity<>(nursery,HttpStatus.OK);
    }

}

