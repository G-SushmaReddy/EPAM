package collectingDataInAStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,"Testing");
        Employee emp1 = new Employee("Sindhu",19,"Development");
        Employee emp2 = new Employee("Ram",56,"Testing");
        Employee emp3 = new Employee("Sita",24,"Development");
        Employee emp4 = new Employee("Laxman",77,"Testing");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        if(employeeList == null || employeeList.isEmpty())
        {
            throw new IllegalArgumentException("EmployeeList cannot be null");
        }
        Map<String,List<Employee>> mapping = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry<String,List<Employee>> entry:mapping.entrySet())
        {
            System.out.println(entry.getKey()+":");
            for(Employee emplo:entry.getValue())
            {
                emplo.displayDetails();
            }
        }
    }
}
