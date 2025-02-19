package com.example.sunil.interviewQuestions;

// print the previous character for nth time of next number
// prints the characters for the specified number of times based on the given input string

public class PrintCharsNTimes {
    public static void main(String[] args) {
        String input = "a2b1c5a3";
        System.out.println(printCharsNTimes(input));

    }

    public static String printCharsNTimes(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<str.length(); i+=2){
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));
            for (int j = 0; j<count; j++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
