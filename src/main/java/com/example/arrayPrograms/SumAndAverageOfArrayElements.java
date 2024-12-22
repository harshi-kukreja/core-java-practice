package com.example.arrayPrograms;

import java.util.Scanner;

public class SumAndAverageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + (sum / arr.length));

    }
}
