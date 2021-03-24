package com.example.java15.demo.feature.sealed;

public abstract sealed

class SealedPerson permits Employee,Manager {
    public void testSealed() {
        System.out.println("calling SealedPerson");
    }
}
