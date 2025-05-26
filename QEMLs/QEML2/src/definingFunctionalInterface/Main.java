package definingFunctionalInterface;

public class Main {
    public static void main(String args[])
    {
        FullTimeEmployee emp=new FullTimeEmployee("Sushma",21,24000);
        PartTimeEmployee emp1=new PartTimeEmployee("John",19,26,1000);
        System.out.println("Salary of Full Time Employee:"+emp.calculate());
        System.out.println("Salary of Part Time Employee:"+emp1.calculate());
    }
}
