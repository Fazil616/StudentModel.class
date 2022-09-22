package com.example.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "nursery")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class nursery {
    @Id
    @Basic
    @Column(name = "Id")
    Integer Id;

    @Basic
    @Column(name="name")
    String name;

    @Basic
    @Column(name="quantity")
   String quantity;

    @Basic
    @Column(name="contact")
    String contact;




}

