package com.example.java15.demo.feature.expresson;

public class SwitchExpression {

    public static void main(String[] args) {

        System.out.println(" Bad year -> " + runSwithold("2020"));
    }

    public static boolean runSwithold(String str) {

        boolean isBAD;
        switch (str) {
            case "2015":
            case "2016":
            case "2017":
            case "2018":
            case "2019":
                isBAD = false;
                break;
            case "2020":
            case "2021":
                isBAD = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + str);
        }
        return isBAD;
    }

    public static boolean runSwitchNew(String str) {
        return switch (str) {
            case "2015", "2016", "2017", "2018", "2019" -> false;
            case "2020", "2021" -> true;
            default -> throw new IllegalArgumentException("What's a " + str);
        };
    }
}
