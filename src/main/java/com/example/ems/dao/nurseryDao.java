package com.example.ems.dao;

import com.example.ems.entity.nursery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface nurseryDao extends JpaRepository<nursery,Integer> {

    @Override
    List<nursery> findAllById(Iterable<Integer> integers);
}