package com.example.sunil.practiceDemo1;

public class PatternSet {
    public static void main(String[] args) {
        int num=4;
        for(int i=num; i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int num1=5;
        for(int i=0; i<num1;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
