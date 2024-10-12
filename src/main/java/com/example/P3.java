package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("harshi");
        list.add("harshi");
        list.add("swati");
        list.add("rekha");
        list.add("sunil");
        list.add("rekha");

        System.out.println(list.size());

        Set<String> uset = new HashSet<>();
        Set<String> dset = new HashSet<>();

        for (String name : list) {

            if (!uset.add(name)) {
                dset.add(name);
            }
        }
        System.out.println(uset);
        System.out.println(dset);
    }
}
