package org.example;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //Male and Female Employees
        List<Employee> maleEmployees = employeeList.stream()
                .filter(n->n.getGender().equals("Male"))
                .collect(Collectors.toList());
        for(Employee emp:maleEmployees)
        {
            System.out.println(emp.toString());
        }

        System.out.println("Female Employees....");
        List<Employee> femaleEmployees = employeeList.stream()
                .filter(n->n.getGender().equals("Female"))
                .collect(Collectors.toList());
        for(Employee emp:femaleEmployees)
        {
            System.out.println(emp.toString());
        }

        //All departments
        System.out.println("All departments.....");
        List<String> departments = employeeList.stream()
                .map(n->n.getDepartment())
                .collect(Collectors.toList());
        departments.forEach(n-> System.out.println(n));

        //Average age of male and female employees
        System.out.println("Average age of male employees...");
        double averageMaleAge = employeeList.stream()
                .filter(n-> n.getGender().equals("Male"))
                .collect(Collectors.averagingInt(Employee::getAge));
        System.out.println(averageMaleAge);
        System.out.println("Average age of female employees...");
        double averageFemaleAge = employeeList.stream()
                .filter(n-> n.getGender().equals("Female"))
                .collect(Collectors.averagingInt(Employee::getAge));
        System.out.println(averageFemaleAge);

        //Highest paid employee
        Optional<Employee> highpaid = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest padi:"+highpaid);


        /*Optional<Employee> highestPaidEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest Paid Employee:"+highestPaidEmployee.get());

        //Employees joined after 2015
        System.out.println("Employees joined after 2015");
        Stream<Employee> joinedAfter2015 = employeeList.stream()
                .filter(n->n.getYearOfJoining()>2015);
        joinedAfter2015.forEach(System.out::println);

        //Count employees in each department
        System.out.println("Count employees in each department:");
        Map<String,Long> empInEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(empInEachDept);

        //Average Salary of each department
        System.out.println("Average Salary of each department:");
        Map<String,Double> avgSalEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalEachDept);

        //Youngest Male employee:
        System.out.println("Youngest Male employee:");
        Optional<Employee> youngestEmp = employeeList.stream()
                .filter(n->n.getDepartment().equals("Product Development"))
                .filter(n->n.getGender().equals("Male"))
                .min(Comparator.comparingDouble(Employee::getAge));
        System.out.println(youngestEmp.get());

        //Most working experience
        System.out.println("Most working experience:");
        Optional<Employee> experienced = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getYearOfJoining));
        System.out.println(experienced.get());

        //Males in sales and Marketing team
        System.out.println("Males in sales and Marketing team:");
        Optional<Long> malesInSalesAndMar = Optional.of(employeeList.stream()
                .filter(n->n.getGender().equals("Male"))
                .filter(n -> n.getDepartment().equals("Sales And Marketing"))
                .count());
        System.out.println(malesInSalesAndMar.get());

        //Average salary of male and female employees:
        System.out.println("Average salary of male and female employees:");
        Optional<Double> averageSalary = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary)).describeConstable();
        System.out.println(averageSalary.get());

        //All employees in each department
        Map<String,List<String>> emplInEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(emplInEachDept);

        //Seperating Empployees
        System.out.println("Seperating Employees by age:");
        Map<Boolean,List<Employee>> seperate = employeeList.stream()
                .collect(Collectors.partitioningBy(n->n.getAge()>=25));
        System.out.println(seperate);
*/
    }
}
