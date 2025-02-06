package com.example.java8;

public class MultiParamLambda {
    public static void main(String[] args) {
        Functional add = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;

        System.out.println(add.operation(6, 5));
        System.out.println(multiply.operation(6, 5));
    }
}

interface Functional{
    int operation(int a, int b);
}
