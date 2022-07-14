package com.example.designpatterns.creational.factory;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dog extends Animal {
    @Getter
    @Setter
    private String name;
}
