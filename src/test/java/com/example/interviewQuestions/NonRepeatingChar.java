package com.example.interviewQuestions;

import java.util.HashMap;

// find the first non-repeating characters from the given string

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "asasdsaer";
        System.out.println(nonreaptingchars(str));

    }

    public static char nonreaptingchars(String str) {
        HashMap<Character, Integer> chCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            chCount.put(c, chCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (chCount.get(c) == 1) {
                return c;
            }
        }
        return '0';
    }
}
