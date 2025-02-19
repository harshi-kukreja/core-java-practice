package com.example.sunil.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 45, 65, 90, 66, 99, 43, 944);

        nums.forEach(num -> System.out.print(num + ", "));

        System.out.println("filtered out the numbers");
        nums.stream()
                .filter(num -> num%5==0)
                .forEach(num -> System.out.print(num+ ", "));
    }
}
