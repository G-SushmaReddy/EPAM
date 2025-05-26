package chainingFunctionalInterfaces;

import java.util.function.Function;

public class Main {
    public static void main(String[] args)
    {
        FullTimeEmployee emp=new FullTimeEmployee("Sushma",21,24000);
        PartTimeEmployee emp1=new PartTimeEmployee("John",19,26,1000);
        System.out.println("Salary of Full Time Employee"+emp.calculate());
        System.out.println("Salary of Part Time Employee"+emp1.calculate());
        BonusCalculator bonus = salary -> salary *0.1;
        System.out.println("Bonus of full time employee :"+bonus.calculateBonus(emp.calculate()));
        BonusCalculator bonus1 = salary -> salary * 0.05;
        System.out.println("Bonus of part time employee:"+bonus1.calculateBonus(emp1.calculate()));
        double fullTimeSalary = emp.calculate();
        double fullTimeBonus= bonus.calculateBonus(fullTimeSalary);
        Function<Double,Double> FullTimeTotalCompensation =  (salary) ->salary + fullTimeBonus;
        System.out.println("Total Compensation of full time employee:"+FullTimeTotalCompensation.apply(fullTimeSalary));
        double partTimeSalary = emp1.calculate();
        double partTimeBonus = bonus1.calculateBonus(partTimeSalary);
        Function<Double,Double> partTimeTotalCompensation = (salary)-> salary + partTimeBonus;
        System.out.println("Total compensation of part time employee:"+partTimeTotalCompensation.apply(partTimeSalary));
    }
}
