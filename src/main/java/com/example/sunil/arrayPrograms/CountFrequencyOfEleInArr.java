package com.example.sunil.arrayPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// Count the frequency of each element in an array using the Stream API.

public class CountFrequencyOfEleInArr {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4,5, 5, 3};

        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        System.out.println("frequency of element: " + frequencyMap);

    }
}
