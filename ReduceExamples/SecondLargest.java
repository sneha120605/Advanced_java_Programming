package ReduceExamples;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 30, 25);

        int secondLargest = list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second Largest: " + secondLargest);
    }
}
