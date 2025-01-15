package com.example.interviewQuestions;

// implementation of a Singleton class using lazy initialization in Java

public class SingletonLazyCreation {
    private static SingletonLazyCreation instance;

    private SingletonLazyCreation(){
        System.out.println("Instance created");
    }

    public static synchronized SingletonLazyCreation getInstance(){
        if(instance == null){
            instance = new SingletonLazyCreation();
        }
        return instance;
    }



}
