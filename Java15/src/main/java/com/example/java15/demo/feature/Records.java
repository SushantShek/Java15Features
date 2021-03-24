package com.example.java15.demo.feature;

import com.example.java15.demo.feature.record.Person;
import com.example.java15.demo.feature.record.SpecialDate;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

public class Records {
    //records are transparent holders for shallowly immutable data
    public static void main(String[] args) {
        Person p = new Person("A", 20);

        System.out.println(p.name());
        System.out.println(p.age());
        runOldWay();
        withGenerics();
    }

    private static void withGenerics() {
        String name = "My Bday";
        Integer day = 20;
        Month month = Month.OCTOBER;
        LocalDateTime created = LocalDateTime.now();

        SpecialDate myBday = new SpecialDate(name, day, month, created);
        System.out.println(myBday.name() + " " + myBday.day() + " " + myBday.month() + " " + myBday.created());

        SpecialDate altMyBday = new SpecialDate(name, day, month);
        boolean isCreatedNotNull = !Objects.isNull(altMyBday.created());
        System.out.println(" Object Created : " + isCreatedNotNull);

        //Illegal case
        try {
            new SpecialDate(name, 32, month);
        } catch (IllegalArgumentException e) {
            System.out.println("Message exception: " + e.getMessage());
            throw e;
        }
    }

    private static void runOldWay() {
        com.example.java15.demo.old.Person p1 = new com.example.java15.demo.old.Person();
        p1.setAge(30);
        p1.setName("B");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

        com.example.java15.demo.old.Person person = new com.example.java15.demo.old.Person("C", 25);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
