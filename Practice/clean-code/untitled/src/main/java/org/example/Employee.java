package org.example;

public class Employee {

    public String firstName;
    public String lastName;
    public int age;

    public Employee(String firstName,String lastName,int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age =age;
    }

    public String toString(){
        return firstName+" "+lastName+" "+age;
    }
}
