package com.example;

public class ThreadOrderingDemo extends Thread{
    public static void main(String[] args) {

        for (int i=0;i<6;i++){
            new Thread("" +i){
            public void run(){
                System.out.println("Thread :" +getName() + "running");
            }
            }
                    .start();
        }
        }
}
