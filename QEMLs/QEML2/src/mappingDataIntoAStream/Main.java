package mappingDataIntoAStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,25000);
        Employee emp1= new Employee("Sindhu",19,34555);
        Employee emp2 = new Employee("Suraj",34,4789789);
        Employee emp3 = new Employee("Venky",56,9087676);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        Stream<String> employeeNames = employeeList.stream()
                .map(n->n.getName());
        employeeNames.forEach(n->System.out.println(n));

    }


}
