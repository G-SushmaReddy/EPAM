package filteringEmployeesByRoleAndSalary;

public class Employee {
    private String name;
    private String role;
    private String department;
    private double salary;
    public Employee(String name,String role,String department, double salary) {
        if(name == null || name.isEmpty() || department==null || department.isEmpty() || role==null || role.isEmpty() || salary<0)
        {
            throw new IllegalArgumentException("Name,department,role cannot be empty or null and salary cannot be negative");
        }
        this.name = name;
        this.department = department;
        this.role=role;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }
    public String getRole(){
        return this.role;
    }
    public double getSalary() {
        return this.salary;
    }
    public void displayDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Department:"+getDepartment());
        System.out.println("Role:"+getRole());
        System.out.println("Salary:"+getSalary());
    }
}

