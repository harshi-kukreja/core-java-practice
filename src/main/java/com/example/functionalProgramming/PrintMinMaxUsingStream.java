package com.example.functionalProgramming;

import java.util.List;
import java.util.Optional;


// find the min and max numbers from the given list
public class PrintMinMaxUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 234, 34, 56, 112, 2, 97);

        // using optional and reduce
        Optional<Integer> min = numbers.stream()
                .reduce(Math::min); // .reduce((a,b)-> Math.min(a, b));
        System.out.println("Min value from the list: " + min);

        Optional<Integer> max = numbers.stream()
                .reduce(Math::max);  // .reduce((a,b)-> Math.max(a, b));
        System.out.println("Max value from the list: " + max);


        //using reduce
        int max1 = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max1);

//        int min1 = numbers.stream()
//                .reduce(Integer.MIN_VALUE, (a, b) -> a < b ? a : b);
//        System.out.println(min1);


    }

}
