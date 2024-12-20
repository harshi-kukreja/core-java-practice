package com.example;

import static com.example.Testing.addtwoString;

public class AddTwoString {
    public static void main(String[] args) {
        // Add two string a="1234" and b="5678" without type casting them to integer
        String a = "1234";
        String b = "5678";

        String sum = addtwoString(a, b);
        System.out.println(sum);
    }
}
