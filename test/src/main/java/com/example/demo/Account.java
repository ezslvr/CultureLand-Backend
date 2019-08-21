package com.example.demo;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {



    @Id @GeneratedValue
    private Long id;

    private String name;

    private Long number;

    public Account() {
    }

    public Account(Long id, String name, Long number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
