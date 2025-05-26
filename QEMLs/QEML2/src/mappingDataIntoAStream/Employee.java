package mappingDataIntoAStream;

public class Employee {

    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        if(name == null || name.isEmpty() || age<0 || salary<0)
        {
            throw new IllegalArgumentException("Name cannot be null and age,salary cannot be negative");
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
}
