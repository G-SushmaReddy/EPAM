package lambdaExpressionsForMappingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,25000);
        Employee emp1 = new Employee("Sindhu",45,23456);
        Employee emp2 = new Employee("Simran",28,10000);
        Employee emp3 = new Employee("Srujan",65,5000);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        if(employees == null || employees.isEmpty()) {
            throw new IllegalArgumentException("Employee List cannot be null or empty");
        }
        Stream<Employee> employee = employees.stream()
                .map(n -> new Employee(n.getName(),n.getAge(),n.getSalary()*12));
        employee.forEach(n->n.displayDetails());
    }

}
