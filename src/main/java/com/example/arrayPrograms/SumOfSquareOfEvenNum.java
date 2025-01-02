package com.example.arrayPrograms;

import java.util.Arrays;

// Compute the sum of the squares of all even numbers in an array using the Stream API.

public class SumOfSquareOfEvenNum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        int sumOfSquares = Arrays.stream(arr)
                .filter(num -> num %2 ==0)
                .map(num -> num * num)
                .sum();

        System.out.println("Sum of the squares of even number: " + sumOfSquares);

    }
}
