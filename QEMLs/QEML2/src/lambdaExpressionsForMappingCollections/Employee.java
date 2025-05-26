package lambdaExpressionsForMappingCollections;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        if(name == null || name.isEmpty() || age<0 || salary<0)
        {
            throw new IllegalArgumentException("Name cannot be empty or null and salary,age cannot be negative");
        }
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

