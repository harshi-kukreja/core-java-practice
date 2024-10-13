package com.example.practiceDemo1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> animal=new ArrayList<>();
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
