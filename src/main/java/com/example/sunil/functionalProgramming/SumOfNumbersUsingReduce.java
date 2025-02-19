package com.example.sunil.functionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

// calculate the sum of numbers given the list
public class SumOfNumbersUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 5, 7, 8, 9, 34, 11);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of number using for loop: " + sum);

        // Using Reduce method
        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.printf("\nSum of numbers using reduce: %d", newSum);

        // using reduce and lambda
        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a+b);
        System.out.printf("\nSum of numbers using reduce and Lambda: %d", newSum2);
    }
}
