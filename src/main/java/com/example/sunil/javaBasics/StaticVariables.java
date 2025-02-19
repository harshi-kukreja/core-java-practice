package com.example.sunil.javaBasics;

class Example {

    static int count = 0;

    Example() {
        count++;
    }

    public void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        obj1.displayCount(); // Output: Count: 2
        /*
Constructor:
The Example() constructor increments the count variable by 1 whenever a new Example object is created.

Object Creation:
Example obj1 = new Example(); creates an Example object named obj1. This will increment count to 1.
Example obj2 = new Example(); creates another Example object named obj2. This will increment count to 2.

displayCount() Method:
obj1.displayCount() calls the displayCount() method on the obj1 object.
displayCount() prints the value of the count variable, which is now 2, since both obj1 and obj2 have contributed to its increment. */

    }
}


