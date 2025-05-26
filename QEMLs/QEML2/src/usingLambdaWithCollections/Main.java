package usingLambdaWithCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,25000);
        Employee emp1 = new Employee("Sindhu",19,23908);
        Employee emp2 = new Employee("Suman",34,87654);
        Employee emp3 = new Employee("Srikala",40,98765);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        Comparator<Employee> com = (e1,e2)->(e1.getSalary()>e2.getSalary()?1:(e1.getSalary()==e2.getSalary())?0:-1);
        Collections.sort(employees,com);
        for(Employee employee : employees)
        {
            employee.displayDetails();
        }


    }
}
