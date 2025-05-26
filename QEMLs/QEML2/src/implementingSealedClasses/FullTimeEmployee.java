package implementingSealedClasses;

final public class FullTimeEmployee extends Employee {
    private double salary;
    public FullTimeEmployee(String name,int age,double salary)
    {
        super(name,age);
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
}
