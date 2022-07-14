package com.example.springhb.repository;

import com.example.springhb.domain.model.Department;
import com.example.springhb.domain.model.Person;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class GenericRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void customFindMethod() {
        Person p =  (Person) entityManager.createQuery("FROM Person p WHERE p.id = :id")
                .setParameter("id", 1)
                .getSingleResult();
        System.out.println("MY PERSON = " + p.toString());

        Department d =  (Department) entityManager.createQuery("FROM Department d WHERE d.id = :id")
                .setParameter("id", 1)
                .getSingleResult();
        System.out.println("MY DEPARTMENT = " + d.toString());
    }

    public void findByClassAndId( String className, int id) throws ClassNotFoundException {
        String classPath = "com.example.springhb.domain.model." + className;

        System.out.println(
                "OBJECT of type " + className + " = " +
                Class.forName(classPath).cast( entityManager.createQuery("FROM " + className +" obj WHERE obj.id = :id")
                        .setParameter("id", id)
                        .getSingleResult()
                ).toString()
        );
    }

}
