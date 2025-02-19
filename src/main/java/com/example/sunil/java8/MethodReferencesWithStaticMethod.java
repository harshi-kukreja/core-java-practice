package com.example.sunil.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person{
    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter-Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


public class MethodReferencesWithStaticMethod {

    // Static method to compare with name
    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    // // Static method to compare with age
    public static int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }

// main method
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Virat", 40));
        personList.add(new Person("Sunil", 27));
        personList.add(new Person("Rohit", 26));
        personList.add(new Person("Sachin", 45));

        // Using static method reference to sort array by name
        Collections.sort(personList, MethodReferencesWithStaticMethod::compareByName);

        // display msg only
        System.out.println("Sort by name: ");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        // Now using static method reference to sort array by age

        Collections.sort(personList, MethodReferencesWithStaticMethod::compareByAge);

        // Display msg only
        System.out.println("Sort by age: ");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

    }
}
