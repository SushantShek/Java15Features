package com.example.java15.demo.feature.record;

import java.time.Month;

public record CelebrationGenericRecord<T>(T contents,String name,Integer day,Month month){
        }