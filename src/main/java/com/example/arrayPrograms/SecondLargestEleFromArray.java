package com.example.arrayPrograms;

import java.util.Arrays;

// Write a program to find the second largest element in an array using the Stream API.

public class SecondLargestEleFromArray {
    public static void main(String[] args) {
        int[] arr = {80, 40, 66, 78, 94, 91};

        int secondLargest = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Second largest element found"));

        System.out.println("Second largest number: "+ secondLargest);
    }
}
