package usingBuiltInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("Sriya",45,1000);
        Employee emp1=new Employee("Sindhu",25,45000);
        Employee emp2=new Employee("Sandy",23,12000);
        Predicate<Double> salarylimit = salary -> salary>15000.00;
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        for(Employee emplo:employees)
        {
            if(salarylimit.test(emplo.getSalary()))
            {
                emplo.displayDetails();
            }
        }
    }

}
