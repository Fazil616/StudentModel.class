package com.example.ems.service;

import com.example.ems.dao.nurseryDao;
import com.example.ems.entity.nursery;
import com.example.ems.model.nursery.nurseryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class nurseryService {

    @Autowired
    public nurseryDao nurserydao;

    public nursery savenursery(nurseryModel nurseryModel){
        nursery nursery=new nursery();
        nursery.setId(nurseryModel.getId());
        nursery.setName(nurseryModel.getName());
        nursery.setQuantity(nurseryModel.getQuantity());
        nursery.setContact(nurseryModel.getContact());
        nurserydao.save(nursery);
        return nursery;
    }
}