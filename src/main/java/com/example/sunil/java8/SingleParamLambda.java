package com.example.sunil.java8;


// using lambda expression with a condition to selectively print even number of elements from an ArrayList.

import java.util.ArrayList;

public class SingleParamLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(21);
        arrayList.add(30);
        arrayList.add(41);
        arrayList.add(50);

        // Using lambda expression to print all elements of arraylist

        System.out.println("Elements of arraylist: ");
        arrayList.forEach(n -> System.out.println(n));

        System.out.println("\nEven elements of arrayList: ");

        arrayList.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}
