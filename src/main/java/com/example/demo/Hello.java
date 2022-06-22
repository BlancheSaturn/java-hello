package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {
    @Id
    private int id;

    private String greeting;

    public Hello() {
    }

    public Hello(int id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public int getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }
}
