package chainingFunctionalInterfaces;

public class FullTimeEmployee extends RegularSalaryCalculator implements SalaryCalculator{
    private double salary;
    public FullTimeEmployee(String name,int age,double salary)
    {
        super(name,age);
        if(salary<0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    @Override
    public double calculate() {
        return getSalary();
    }

}
