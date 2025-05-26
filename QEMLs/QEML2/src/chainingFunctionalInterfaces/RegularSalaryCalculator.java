package chainingFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class RegularSalaryCalculator {
    private String name;
    private int age;

    public RegularSalaryCalculator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}