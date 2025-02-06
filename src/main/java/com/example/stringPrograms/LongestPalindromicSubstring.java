package com.example.stringPrograms;


// Find the longest substring in a given string that is a palindrome.

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 0;

        for (int len = 1; len <= n; len++) { // Length of the substring
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1; // Ending index of the substring

                if (s.charAt(i) == s.charAt(j)) {
                    if (len <= 2) {
                        dp[i][j] = true; // Single char or two identical chars
                    } else {
                        dp[i][j] = dp[i + 1][j - 1]; // Check inner substring
                    }

                    if (dp[i][j] && len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
    }
}
