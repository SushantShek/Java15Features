package com.example.java15.demo.feature.record;

/**
 * They are final and immutable.
 * They can implement interfaces.
 * They can have static members.
 * They can define validations.
 * They can define default values.
 * They accept generics.
 */
public record Person(String name,int age){
public Person{
        if(age< 0){
        throw new IllegalArgumentException("Age cannot be negative");
        }
        }
        }
