package com.example.sunil.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class StreamsAndLambdaEx1 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "PineApple", "Chiku", "Mango", "Anar");

        System.out.println(fruits.size());

        System.out.println("Printing fruits normally: ");
        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }

        System.out.println("\nPrinting fruits with Streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.print(fruit + ", ");
            }
        });

        System.out.println("\nPrinting fruits with Streams and Lambda");
        fruits.stream().forEach(fruit -> System.out.print(fruit + ", "));

        System.out.println("\nPrinting fruits using Stream filter and Lambda");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.print(fruit + ", "));
    }
}
