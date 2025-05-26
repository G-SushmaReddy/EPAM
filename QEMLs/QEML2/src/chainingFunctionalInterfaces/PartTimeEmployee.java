package chainingFunctionalInterfaces;

public class PartTimeEmployee extends RegularSalaryCalculator implements SalaryCalculator {
    private int workHours;
    private double payPerHour;
    public PartTimeEmployee(String name,int age,int workHours,double payPerHour)
    {
        super(name,age);
        if(workHours<0) {
            throw new IllegalArgumentException("Work Hours cannot be negative");
        }
        if(payPerHour<0) {
            throw new IllegalArgumentException("Pay cannot be negative");
        }
        this.workHours=workHours;
        this.payPerHour=payPerHour;
    }
    public int getWorkHours(){
        return this.workHours;
    }
    public double getPayPerHour(){
        return this.payPerHour;
    }
    @Override
    public double calculate() {
        return getWorkHours()*getPayPerHour();
    }
}
