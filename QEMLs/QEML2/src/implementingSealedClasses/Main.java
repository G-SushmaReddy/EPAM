package implementingSealedClasses;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Sushma",21,25000);
        ContractEmployee emp1 = new ContractEmployee("Sindhu",19,6,500);
        System.out.println("Salary of full time employee:"+emp.getSalary());
        System.out.println("Salary of contract employee:"+emp1.getSalary());
    }
}
