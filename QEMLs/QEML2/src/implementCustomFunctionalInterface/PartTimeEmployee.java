package implementCustomFunctionalInterface;


public class PartTimeEmployee extends Employee implements VariableSalaryCalculator{
    private double percentage;
    public PartTimeEmployee(String name,int age,double salary,double percentage)
    {
        super(name, age, salary);
        this.percentage=percentage;
    }
    public double getPercentage(){
        return this.percentage;
    }
    @Override
    public double calculate(double salary,double percentage) {
        return salary+ (salary * (percentage / 100));
    }
}
