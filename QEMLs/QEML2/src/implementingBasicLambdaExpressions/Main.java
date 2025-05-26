package implementingBasicLambdaExpressions;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,25000);
        SalaryCalculator sal = (salary) -> salary + 2450.45;
        System.out.println("Salary of the employee:"+sal.calculate(emp.getSalary()));

    }
}
