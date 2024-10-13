package com.example.practiceDemo1;

class Vehicle{
    public void Sound(){
        System.out.println("Vroom!!");
    }
    public void Model(){
        System.out.println("BMW");
    }
}

class Honda extends Vehicle{
    public void Series(){
        System.out.println("3rd series");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.Series();
        obj.Model();
        obj.Sound();

    }
}
