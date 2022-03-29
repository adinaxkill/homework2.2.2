package com.company;

import com.company.Printable;

import java.util.SplittableRandom;

public abstract class Animal implements Printable {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getInfo() {
        return  "Age" + age +
                "\nName" + name;
    }
}
