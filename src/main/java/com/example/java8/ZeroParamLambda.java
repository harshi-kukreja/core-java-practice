package com.example.java8;

public class ZeroParamLambda {
    public static void main(String[] args) {

        ZeroParameter zeroParameter = () -> System.out.println("This is a zero-parameter lambda expression!");

        zeroParameter.display();
    }
}

@FunctionalInterface
interface ZeroParameter{
    void display();
}
