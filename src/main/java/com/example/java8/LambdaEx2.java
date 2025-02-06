package com.example.java8;

public class LambdaEx2 {
    public static void main(String[] args) {

        FuncInterface funcInterfaceObj = (int x) -> System.out.println(2*x); // Lambda Expression

        funcInterfaceObj.abstractMethod(10);
        funcInterfaceObj.nonAbstractMethod();
    }
}

interface FuncInterface{

    void abstractMethod(int x);

    default void nonAbstractMethod(){
        System.out.println("Hello");
    }
}
