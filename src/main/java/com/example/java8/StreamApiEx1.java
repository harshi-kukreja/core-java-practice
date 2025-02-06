package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sunil", "Gudle", "Rohit", "Sonu", "Atul");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);

        System.out.println(" Java 11 Feature  ".strip()); // Removes leading/trailing spaces
    }
}
