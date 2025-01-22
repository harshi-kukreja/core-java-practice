package com.example;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 1, 5};

        int target =6;



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
