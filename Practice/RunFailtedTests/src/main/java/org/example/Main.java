package org.example;

class Parent {
    public static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    // No static method defined in the child class
}

public class Main {
    public static void main(String[] args) {
        Parent parentRef = new Child();
        parentRef.staticMethod(); // Output: "Parent static method"

        Child childRef = new Child();
        childRef.staticMethod(); // Output: "Parent static method"
    }
}