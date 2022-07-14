package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.annotation.PostConstruct;

public class Ceva {

    @Value("${something}")
    String something;

    @PostConstruct
    public void printMsg() {
        System.out.println("ZZZZZ = " + something);
    }
}
