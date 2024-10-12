package com.example;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> animal=new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("cow");
        animal.add("horse");
        animal.remove(2);
         for (int i=0;i<animal.size();i++){
             System.out.println(animal.get(i));
         }
    }
}
