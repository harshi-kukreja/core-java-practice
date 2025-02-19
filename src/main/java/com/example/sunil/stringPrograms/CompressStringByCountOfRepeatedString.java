package com.example.sunil.stringPrograms;

/*
Implement a function that compresses a string using the counts of repeated characters.
If the compressed string is not smaller than the original, return the original string.
Example Input:
aabcccccaaa
Example Output:
a2b1c5a3
 */
public class CompressStringByCountOfRepeatedString {

    public static String compressString(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(s.charAt(s.length() - 1)).append(count);

        // Return the original string if the compressed one is not shorter
        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compressString(input);
        System.out.println("Compressed String: " + result);
    }
}
