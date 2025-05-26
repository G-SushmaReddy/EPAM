package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Bharath {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bharath","bharath","bob","Krishna","Ramu","Hari");
        Map<String,Long> result = names.stream()
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("B"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        //List<Integer> sums = Arrays.asList(a);
        int sum = Arrays.stream(a)
                .boxed()
                .collect(Collectors.summingInt(Integer::intValue));

        int simplesum = Arrays.stream(a)
                .boxed()
                .collect(Collectors.summingInt(an->an));

        double average = Arrays.stream(a)
                        .boxed()
                                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(sum);
        System.out.println(average);

    }
}
