package com.example.sunil.interviewQuestions;

// program to reverse the words: input = "the sky is blue" and output = blue is sky

public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";

        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String str){

        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            reversed.append(words[i]);
            if (i!=0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
