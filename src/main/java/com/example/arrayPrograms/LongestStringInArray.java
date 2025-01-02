package com.example.arrayPrograms;

import java.util.Arrays;

// Determine the longest string in a string array using the Stream API.

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "blueberry", "grape"};

        String longestWord = Arrays.stream(words)
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");

        System.out.println("Longest String: "+ longestWord);
    }
}
