package com.example.sunil.arrayPrograms;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 1, 8, 8, 2, 2, 2, 5, 1 };
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = visited;
                }
            }
            if (arr[i] != visited) {
                System.out.println("Element " + arr[i] + " is repeated " + count + " times");
            }
        }
    }
}
