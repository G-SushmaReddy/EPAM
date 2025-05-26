package collectingDataInAStream;

public class Employee {
    private String name;
    private int age;
    private String department;
    public Employee(String name,int age,String department)
    {
        if(name == null || name.isEmpty() || age<0 || department==null || department.isEmpty())
        {
            throw new IllegalArgumentException("Name,department cannot be null and age cannot be negative:");
        }
        this.name=name;
        this.age=age;
        this.department = department;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getDepartment(){
        return this.department;
    }
    public void displayDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Department:"+getDepartment());
    }
}
