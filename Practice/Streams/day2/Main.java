/*Perform the following tasks using Java 8 Streams:

        Filter all employees from the "IT" department.

        Increase their salary by 10%.

        Collect the updated employees into a new list.

        Print their names and new salaries.*/

package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(21,"Sushma","IT",24567.7);
        Employee emp1 = new Employee(22,"Sindhu","IT",24367.7);
        Employee emp2 = new Employee(23,"Suri","IT",245657.7);
        Employee emp3 = new Employee(24,"Thiruma","IT",244567.7);
        Employee emp4 = new Employee(25,"Ramu","INT",245673.7);
        Employee emp5 = new Employee(26,"Venki","IBT",245675.7);
        Employee emp6 = new Employee(27,"John","IST",245674.7);
        Employee emp7 = new Employee(28,"Suresh","IBT",245657.7);
        Employee emp8 = new Employee(29,"Ramesh","IFT",245567.7);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(emp,emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8));

        List<Employee> newList = employeeList.stream()
                .filter(employee->employee.getDepartment().equals("IT"))
                .map(employee ->{employee.setSalary(employee.getSalary()*1.10);
                    return employee;})
                .collect(Collectors.toList());

        for(Employee employee:newList)
        {
            System.out.println(employee.getName()+" "+employee.getSalary());
        }



    }
}
