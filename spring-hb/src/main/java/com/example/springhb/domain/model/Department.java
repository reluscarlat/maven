package com.example.springhb.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department implements IEntity{

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String abbreviation;

}
