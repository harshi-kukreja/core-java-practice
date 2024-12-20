package com.example;

public class Testing {
    public static void main(String[] args) {
        String a = "1234";
        String b = "5678";

        String sum = addtwoString(a, b);
        System.out.println(sum);

    }

    public static String addtwoString(String num1, String num2){

        StringBuilder modValue = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;

        int carry = 0;

        while( i >=0 || j >=0 || carry !=0){
            int value1 = i >=0 ? num1.charAt(i) - '0' : 0;
            int value2 = j >=0 ? num2.charAt(j) - '0' : 0;

            int sumValue = value1 + value2 + carry;
            carry = sumValue/10;

             modValue.append(sumValue%10);

            i--;
            j--;
        }

        return modValue.reverse().toString();
    }
}
