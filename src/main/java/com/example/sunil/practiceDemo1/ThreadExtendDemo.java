package com.example.sunil.practiceDemo1;

public class ThreadExtendDemo extends Thread{
    public static void main(String[] args) {
        ThreadExtendDemo obj=new ThreadExtendDemo();
        obj.start();
        System.out.println("outside of thread");
    }
    public void run(){
        System.out.println("inside of thread");
    }
}
