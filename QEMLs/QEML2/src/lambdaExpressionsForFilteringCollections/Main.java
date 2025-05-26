package lambdaExpressionsForFilteringCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma","Manager","Testing",25000);
        Employee emp1 = new Employee("Sindhu","Engineer","Development",23456);
        Employee emp2 = new Employee("Simran","HR","Data Analytics",10000);
        Employee emp3 = new Employee("Srujan","Manager","Testing",5000);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        for(Employee employ: employees)
        {
            if(employ==null)
            {
                throw new IllegalArgumentException("Employee cannot be null");
            }
        }
        if(employees == null || employees.isEmpty()) { 
            throw new IllegalArgumentException("Employee List cannot be null or empty"); 
        }
        Stream<Employee> employee = employees.stream()
                .filter(n->(n.getSalary()>15000));
        employee.forEach(n->n.displayDetails());

    }
}
