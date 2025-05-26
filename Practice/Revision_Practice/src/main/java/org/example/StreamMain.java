package org.example;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Student s1 = new Student(21,"Sushma");
        Student s2 = new Student(22,"Sindhu");
        Student s3 = new Student(21,"Thiruma");
        Student s4 = new Student(22,"Suri");

        List<Student> sl =  new ArrayList<>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        sl.add(s4);

        Map<Integer,List<Student>> groups = sl.stream()
                .collect(Collectors.groupingBy(s->s.getId()));
        System.out.println(groups);

        Map<Boolean,List<Student>> partitions = sl.stream()
                .collect(Collectors.partitioningBy(s->s.getId()>21));
        System.out.println(partitions);

        int[] arr = new int[]{1,2,3,4,5,6};
        int sum = Arrays.stream(arr).reduce(0,(a,b)->(a+b));
        System.out.println(sum);

        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,2);
        int summing = al.stream().collect(Collectors.summingInt(Integer::intValue));
        int summ = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.summingInt(Integer::intValue));


        //sum of 10 natural numbers
        int result = IntStream.rangeClosed(1,10).boxed().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of natural numbers :"+result);

        //print 10 even numbers
        List<Integer> evenNumbers = Stream.iterate(0,n->n+2).limit(10)
                .collect(Collectors.toList());
        System.out.println("Even numbers:"+evenNumbers);

        //Most repeated element
        Map<Integer,Long> freq = al.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency:"+freq);


    }
}
