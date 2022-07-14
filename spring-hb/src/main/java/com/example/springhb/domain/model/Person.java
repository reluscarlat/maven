package com.example.springhb.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements IEntity {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String country;

    @Column
    private String address;
}
