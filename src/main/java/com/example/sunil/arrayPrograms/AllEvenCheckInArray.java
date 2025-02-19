package com.example.sunil.arrayPrograms;

import java.util.Arrays;

// Verify if all elements in the given array are even using the Stream API.

public class AllEvenCheckInArray {
    public static void main(String[] args) {
        int[] arr = {2, 46,64,48, 58, 86};

        boolean allEven = Arrays.stream(arr)
                .allMatch(num -> num % 2 ==0);

        System.out.println(allEven);
    }
}
