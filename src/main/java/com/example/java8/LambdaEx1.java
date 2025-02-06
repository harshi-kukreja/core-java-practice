package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sunil", "Gudle", "Rohit", "Sonu");
        names.forEach(name -> System.out.println(name));


    }
}
