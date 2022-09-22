package com.example.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "crud")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  crud{
    @Id
    @Basic
    @Column(name = "id")
    Integer crudid;

    @Basic
    @Column(name = "email")
    String  email;

    @Basic
    @Column(name = "Mobile_no")
    String Mobile;

    @Basic
    @Column(name = "password")
    String password;

}


