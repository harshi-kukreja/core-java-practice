package com.example.sunil.interviewQuestions;

import java.util.HashMap;

// find the occurrence of each character from given string

public class OccurrenceOfChars {
    public static void main(String[] args) {
        String str = "hello java";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        for (char value : charCount.keySet()) {
            System.out.println(value + ": " + charCount.get(value));
        }
    }
}
