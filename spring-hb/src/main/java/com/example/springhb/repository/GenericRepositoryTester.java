package com.example.springhb.repository;

import com.example.springhb.domain.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.Column;

@Component
public class GenericRepositoryTester {

    @Autowired
    private GenericRepository genericRepository;

    @PostConstruct
    public void foo() {
        try {
            genericRepository.findByClassAndId("Person", 1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
