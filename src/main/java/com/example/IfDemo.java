package com.example;

public class IfDemo {
    public static void main(String[] args) {
        If();
        IfElse();
        IfElseIf();
    }
    public static void If(){
        if(10>8){
            System.out.println("10 is greater than 8");
        }
    }

    public static void IfElse(){
        int a=3;
        int b=4;
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }

    public static void IfElseIf(){
        int num=2;
        int num1=4;
        int num2=5;
        if (num>num1 && num2>num1){
            System.out.println("greater number from if condition");
        } else if (num2<num ||num>num1) {
            System.out.println("greater number from else if");
        }
        else {
            System.out.println("execute else statement");
        }
    }
}
