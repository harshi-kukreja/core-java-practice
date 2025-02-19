package com.example.sunil.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class StringArrayUsingStream {
    public static void main(String[] args) {
        String[] names = {"Sunil", "Gudle", "Harshi", "Ram", "Ramesh", "Java"};
        Arrays.stream(names).forEach(name -> System.out.println(name));

        System.out.println("\nLists: ");

        List<String> language = List.of("English", "Marathi", "Punjabi", "Hindi");
        language.stream()
                .forEach(lang -> System.out.println(lang));


    }
}
