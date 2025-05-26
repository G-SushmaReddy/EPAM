package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma","Ganta",21);
        Employee emp1 = new Employee("Sushma","Ganta",24);
        Employee emp2 = new Employee("John","Doe",43);
        Employee emp3 = new Employee("John","Doe",56);
        Employee emp4 = new Employee("Ramu","G",54);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        Map<String,Integer> employeeCount = new HashMap<>();

        Map<String,Long> streamsEmployeeCount = employeeList.stream()
                        .collect(Collectors.groupingBy(employee -> employee.firstName+employee.lastName,Collectors.counting()));

        /*Map<String,Long> count = streamsEmployeeCount.stream()
                        .collect(Collectors.groupingBy(s->Collectors.counting());*/

        System.out.println(streamsEmployeeCount);

        /*for(Employee employee : employeeList)
        {
            employeeCount.put(employee.firstName+employee.lastName,employeeCount.getOrDefault(employee.firstName+employee.lastName,0)+1);
        }*/

        for(Map.Entry<String,Long> entry:streamsEmployeeCount.entrySet())
        {
            if(entry.getValue()>=2)
            {
                System.out.println(entry.getKey());
            }
        }

      //  System.out.println(employeeCount);

    }
}