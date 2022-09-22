package com.example.ems.dao;

import com.example.ems.entity.crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface crudDao extends JpaRepository<crud,Integer> {

}
