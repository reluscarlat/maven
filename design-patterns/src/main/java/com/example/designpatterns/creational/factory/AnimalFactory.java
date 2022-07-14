package com.example.designpatterns.creational.factory;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name) {
        switch (type) {
            case "cat" : {
                return new Cat(name);
            }
            case "dog" : {
                return new Dog(name);
            }
            default: {
                return new Dog(name);
            }
        }
    }
}
