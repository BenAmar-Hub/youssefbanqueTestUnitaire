package com.amigoscode.streams;

import com.amigoscode.fonctionnelle.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.amigoscode.streams._Streams.Gender.*;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        System.out.println("****** have all gender without duplicate *****");
        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("****** have all names without duplicate *****");
        people.stream().map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("****** have all length names without duplicate *****");

        people.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(x -> System.out.println(x));
        System.out.println("***** use match all to verif  that all person are FEMALE");
        boolean b = people.stream().
                allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(b);
        System.out.println("***** use match any to verif  that all person contains FEMALE");
        boolean b1 = people.stream().
                anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(b1);
    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
