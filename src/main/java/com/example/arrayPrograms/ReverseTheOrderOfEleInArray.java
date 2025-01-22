package com.example.arrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Reverse the order of elements in the array using the Stream API.

public class ReverseTheOrderOfEleInArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        List<Integer> reversedList = Arrays.stream(arr)
                .collect(Collectors.toList());
        Collections.reverse(reversedList);

        System.out.println("Reversed array: "+ reversedList);
    }
}
