package implementingSealedClasses;

sealed public class Employee permits FullTimeEmployee, ContractEmployee {
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        if(name == null || name.isEmpty() || age<0)
        {
            throw new IllegalArgumentException("Name cannot be empty, age cannot be negative");
        }
        this.name = name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "Name"+
                name +
                "age"+
                age;
    }
}
