package com.example.java15.demo.feature.record;

import java.time.LocalDateTime;
import java.time.Month;

public record SpecialDate(String name,Integer day,Month month,LocalDateTime created)implements CelebrationInterface{

/**
 * Additional static members
 */
private static int totalDates;

/**
 * Define validations for the attributtes
 * @param name
 * @param day
 * @param month
 * @param created
 */
public SpecialDate{
        if(day< 1||day>31){
        throw new IllegalArgumentException("Day must be on the interval 1-31.");
        }

        totalDates++;
        }

/**
 * Additional constructor, to assign a default value to attribute "created"
 * @param name
 * @param day
 * @param month
 */
public SpecialDate(String name,Integer day,Month month){
        this(name,day,month,LocalDateTime.now());
        }

/**
 * Additional public method to retrieve
 */
public int totalDates(){
        return totalDates;
        }

        }