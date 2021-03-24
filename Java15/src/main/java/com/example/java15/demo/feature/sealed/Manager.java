package com.example.java15.demo.feature.sealed;

public final class Manager extends SealedPerson {

    private int tenure;
    private String name;

    public static void main(String[] args) {
        SealedPerson person = new Manager();

        if (person instanceof Manager manager && manager.getTenure() > 5){
            //...
            System.out.println("Do somthing");
        }
    }


    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
