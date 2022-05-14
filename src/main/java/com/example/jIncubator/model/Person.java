package com.example.jIncubator.model;

public class Person {
    String name;
    Integer age;
    Occupation occupation;

    public Person() {
    }

    public Person(String name, Integer age, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
