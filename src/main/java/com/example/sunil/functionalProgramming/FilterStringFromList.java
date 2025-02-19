package com.example.sunil.functionalProgramming;

import java.util.List;

public class FilterStringFromList {
    public static void main(String[] args) {
        List<String> lists = List.of("Hi", "Hello", "Sunil", "Gudle", "Harshi", "Something", "Somehow", "Somewhere");

        String result = lists.stream()
                .filter(list -> list.length()>4)
                .reduce("", (a, b) -> a + " "+ b);

        System.out.println(result);
    }
}
