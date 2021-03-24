package com.example.java15.demo.old;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.Map;

@Setter
@Getter
@Data
public class Person {


    private String name;
    private int age;

    public Person(String a, int i) {
        this.age = i;
        this.name = a;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
