package com.example.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// sort a HashMap by values

public class SortHashMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Zebra",3, "Apple", 1, "Monkey", 4);

        Map<String, Integer> sortedByValues = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));

        System.out.println(sortedByValues);

    }
}
