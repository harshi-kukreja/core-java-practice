package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// find even numbers from a given list using stream api


public class EvenNoFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> evens = numbers.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

        System.out.println(evens);
    }
}
