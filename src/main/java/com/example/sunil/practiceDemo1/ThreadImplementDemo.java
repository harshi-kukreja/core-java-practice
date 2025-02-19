package com.example.sunil.practiceDemo1;

public class ThreadImplementDemo implements Runnable{
    public static void main(String[] args) {
        ThreadImplementDemo obj=new ThreadImplementDemo();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("outside of thread");
    }
    public void run(){
        System.out.println("inside of thread");
    }
}
