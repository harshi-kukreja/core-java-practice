package com.example.functionalProgramming;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class MultiplicationUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the input numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        BinaryOperator<Integer> multiplication = (a, b)-> a*b;
        int result = multiplication.apply(num1, num2);

        System.out.println("Result is: " + result);
    }
}
