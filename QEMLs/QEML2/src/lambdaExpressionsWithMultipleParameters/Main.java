package lambdaExpressionsWithMultipleParameters;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Sushma",21,25000,9);
        BonusCalculator bonus = ((salary, performanceRating) -> (salary+performanceRating*1000));
        System.out.println(bonus.calculateBonus(emp.getSalary(), emp.getPerformanceRating()));


    }
}
