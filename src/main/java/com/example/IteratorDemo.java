package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("cow");
        animal.add("horse");

        Iterator<String> obj = animal.iterator();
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(obj.next());

        }
    }
}
