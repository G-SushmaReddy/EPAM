package distinctElementsInAStream;

public class Employee {
    private String name;
    private double salary;
    private String department;
    public Employee(String name,double salary,String department)
    {
        if(name == null || name.isEmpty() || salary<0 || department==null || department.isEmpty())
        {
            throw new IllegalArgumentException("Name,department cannot be null and salary cannot be negative:");
        }
        this.name=name;
        this.salary=salary;
        this.department = department;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDepartment(){
        return this.department;
    }
}
