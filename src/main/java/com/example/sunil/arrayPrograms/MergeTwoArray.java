package com.example.sunil.arrayPrograms;

import java.util.Arrays;

// merge the given two arrays

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2, 5, 6};

        int[] merge = new int[num1.length + num1.length];

        System.arraycopy(num1, 0, merge, 0, num2.length);
        System.arraycopy(num2, 0, merge, num1.length, num2.length);

        Arrays.sort(merge);

        System.out.println(Arrays.toString(merge));


    }
}
