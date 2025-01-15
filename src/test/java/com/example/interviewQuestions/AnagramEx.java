package com.example.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// find the array of anagram of words from given array

public class AnagramEx {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat" };

        Map<String, List<String>> groupAnagram = Arrays.stream(arr)
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        groupAnagram.values().forEach(group -> {
            System.out.println(group);
        });
    }
}
