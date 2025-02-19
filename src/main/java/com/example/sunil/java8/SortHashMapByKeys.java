package com.example.sunil.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// sort a HashMap by keys

public class SortHashMapByKeys {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Zebra",3, "Apple", 1, "Monkey", 2);

        Map<String, Integer> sortedByKeys = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
        System.out.println(sortedByKeys);
    }
}
