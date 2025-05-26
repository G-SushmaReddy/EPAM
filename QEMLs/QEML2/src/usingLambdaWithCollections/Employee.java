package usingLambdaWithCollections;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }
    public void displayDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Salary:"+getSalary());
    }
}
