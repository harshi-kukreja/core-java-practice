package com.example.sunil.interviewQuestions;

// find the index of target value from array

public class TargetValue {
    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,8,8,10};
        int target = 8;

        int index = findTargetIndex(num, target);
        System.out.println("Index of target value: "+ index);

    }

    public static int findTargetIndex(int[] num, int target){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target){
                return i;
            }
        }
        return -1;
    }
}
