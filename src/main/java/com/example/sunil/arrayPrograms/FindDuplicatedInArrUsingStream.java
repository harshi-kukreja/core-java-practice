package com.example.sunil.arrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Identify the duplicate elements in an array using the Stream API.

public class FindDuplicatedInArrUsingStream {
    public static void main(String[] args) {
        int[] arr = {23, 48, 56, 83, 48, 39, 94, 56
        };

        List<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate elements are: " + duplicates);
    }
}
