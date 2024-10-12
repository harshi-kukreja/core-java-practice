package com.example;

public class Palindrome {
    public static void main(String[] args) {
        String name="HARSHI";
        String reverse="";

        for (int i=name.length()-1;i>=0; i--){
            reverse= reverse+ name.charAt(i);
        }
        System.out.println(reverse);

        if(name.equals(reverse))
        {
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrome");
        }
//        String reverse= "";
//
//        for (int i=name.length()-1; i>=0;  i--){
//            reverse= reverse + name
//        }
    }
}
