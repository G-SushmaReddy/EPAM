package day3;

import day2.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        day2.Employee emp = new day2.Employee(21,"Sushma","IT",24567.7);
        day2.Employee emp1 = new day2.Employee(22,"Sindhu","IT",24367.7);
        day2.Employee emp2 = new day2.Employee(23,"Suri","IT",245657.7);
        day2.Employee emp3 = new day2.Employee(24,"Thiruma","IT",244567.7);
        day2.Employee emp4 = new day2.Employee(25,"Ramu","INT",245673.7);
        day2.Employee emp5 = new day2.Employee(26,"Venki","IBT",245675.7);
        day2.Employee emp6 = new day2.Employee(27,"John","IST",245674.7);
        day2.Employee emp7 = new day2.Employee(28,"Suresh","IBT",245657.7);
        day2.Employee emp8 = new day2.Employee(29,"Ramesh","IFT",245567.7);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(emp,emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8));

       /* Group the employees by their department.

        Count how many employees are there in each department.

                Print the department name along with the employee count.*/
        Map<String,Long> departmentCount = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.counting()));
        System.out.println(departmentCount);

        /*Group employees by their department.

        Calculate the average salary for each department.

        Print the department name along with the average salary (rounded to 2 decimal places).*/

        Map<String,Double> groupingEmployeeByDept = employeeList.stream()
                .collect(Collectors.groupingBy(employee->employee.getDepartment()
                        ,Collectors.averagingDouble(employee->employee.getSalary())));

        System.out.println(groupingEmployeeByDept);




    }

}
