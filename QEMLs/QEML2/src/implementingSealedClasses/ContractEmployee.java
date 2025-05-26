package implementingSealedClasses;

final public class ContractEmployee extends Employee{
    private int workHours;
    private double payPerHour;
    public ContractEmployee(String name,int age,int workHours,double payPerHour)
    {
        super(name, age);
        this.workHours = workHours;
        this.payPerHour = payPerHour;
    }
    public int getWorkHours(){
        return this.workHours;
    }
    public double getPayPerHour(){
        return this.payPerHour;
    }
    public double getSalary(){
        return getWorkHours()*getPayPerHour();
    }
}
