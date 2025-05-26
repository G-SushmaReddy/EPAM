package usingFunctionalInterfaceWithLambdaExpression;

public class Main {
    public static void main(String[] args)
    {
        FullTimeEmployee emp=new FullTimeEmployee("Sushma",21,24000);
        PartTimeEmployee emp1=new PartTimeEmployee("John",19,26,1000);
        System.out.println("Salary of Full Time Employee:"+emp.calculate());
        System.out.println("Salary of Part Time Employee:"+emp1.calculate());
        BonusCalculator bonus = salary -> salary *0.1;
        System.out.println("Bonus of full time employee :"+bonus.calculateBonus(emp.calculate()));
        BonusCalculator partTimeBonus = salary -> salary * 0.05;
        System.out.println("Bonus of part time employee:"+bonus.calculateBonus(emp1.calculate()));

    }
}
