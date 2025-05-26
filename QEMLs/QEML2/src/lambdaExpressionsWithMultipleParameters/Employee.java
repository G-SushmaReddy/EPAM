package lambdaExpressionsWithMultipleParameters;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int performanceRating;

    public Employee(String name, int age, double salary,int performanceRating) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.performanceRating=performanceRating;
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
    public int getPerformanceRating(){
        return this.performanceRating;
    }
}
