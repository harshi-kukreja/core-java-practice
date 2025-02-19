package com.example.sunil.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// merge two lists using stream api

public class MergeTwoListUsingStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");

        List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println(mergedList);
    }
}
