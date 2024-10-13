package com.example.practiceDemo1;

public class PolmorphismDemo {
    public static void main(String[] args) {
    Animal obj=new Animal();
    obj.Sound();
    obj= new Dog();
    obj.Sound();
    obj= new Cat();
    obj.Sound();
    }
}

class Animal{
    public void Sound(){
        System.out.println("make sound");
    }
}
class Dog extends Animal{
    public void Sound(){
        System.out.println("woof!");
    }
}

class Cat extends Animal{
    public void Sound(){
        System.out.println("meow!");
    }
}

