package sortingDataInAStream;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21000.45,"Testing");
        Employee emp1 = new Employee("Sindhu",19456.34,"Development");
        Employee emp2 = new Employee("Ram",56456.44,"Testing");
        Employee emp3 = new Employee("Sita",241234.45,"Development");
        Employee emp4 = new Employee("Laxman",77234.43,"Testing");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        Stream<Double> salarySorted = employeeList.stream()
                .map(n->n.getSalary())
                .sorted(Collections.reverseOrder());
        if(salarySorted==null)
        {
            throw new IllegalArgumentException("salarySorted cannot be null");
        }
        salarySorted.forEach(n-> System.out.println(n));
    }
}
