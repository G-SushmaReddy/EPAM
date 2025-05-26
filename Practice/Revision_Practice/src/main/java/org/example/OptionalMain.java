package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Student s1 = new Student(21,"Sushma");
        Optional<Student> optional = Optional.of(s1);

        /*String name = optional
                .flatMap(s->s.getName())
                .orElse("");*/
        String name = optional.map(s->s.getName()).orElse("Sindhu");
        optional.map(s->s.getName()).ifPresent(System.out::println);
        System.out.println(name);

        Optional<String> upper = Optional.of("sushma");
        Optional<String> upperCase = upper.map(s->s.toUpperCase());
        System.out.println(upperCase);

        /*optional.of("Sushma")
          */   /*   .ifPresentOrElse(System.out::println,);*/
    }


}
