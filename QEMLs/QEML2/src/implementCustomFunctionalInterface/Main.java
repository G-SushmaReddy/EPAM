package implementCustomFunctionalInterface;

public class Main {
    public static void main(String[] args) {
    FullTimeEmployee emp = new FullTimeEmployee("Sushma",21,25000,12.5);
    PartTimeEmployee emp1 = new PartTimeEmployee("Sindhu",19,12000,9.4);
    double fullTimeSalary = emp.calculate(emp.getSalary(),emp.getPercentage());
    double partTimeSalary = emp1.calculate(emp1.getSalary(), emp1.getPercentage());
    System.out.println("Full Time salary:"+fullTimeSalary);
    System.out.println("Part Time Salary:"+partTimeSalary);
    }
}
