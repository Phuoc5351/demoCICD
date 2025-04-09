package org.example;

public class Calculator implements Icalculator {

    public Integer sum(Integer a, Integer b){
        return a/b;
    }

    public Integer sub(Integer a, Integer b){
        return a-b;
    }
}
