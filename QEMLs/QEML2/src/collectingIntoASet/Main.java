package collectingIntoASet;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21000.45,"Testing");
        Employee emp5 = new Employee("Hari",21000.45,"Testing");
        Employee emp1 = new Employee("Sindhu",19456.34,"Development");
        Employee emp6= new Employee("Sushma",21000.45,"Testing");
        Employee emp2 = new Employee("Ram",56456.44,"Testing");
        Employee emp3 = new Employee("Sita",241234.45,"Development");
        Employee emp4 = new Employee("Laxman",77234.43,"Testing");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp);
        employeeList.add(emp6);

        //Collecting to a set
        Set<String> employeeSet = employeeList.stream()
                .map(n-> n.getName())
                .collect(Collectors.toSet());
        employeeSet.forEach(n-> System.out.println(n));
    }
}