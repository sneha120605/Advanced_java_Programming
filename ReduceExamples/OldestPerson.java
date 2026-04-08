package ReduceExamples;

puimport java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OldestPerson {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 28)
        );

        Person oldest = list.stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .get();

        System.out.println("Oldest: " + oldest.name);
    }
}