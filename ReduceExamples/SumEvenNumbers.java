package ReduceExamples;

import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = list.stream()
                .reduce(0, (s, n) -> n % 2 == 0 ? s + n : s);

        System.out.println("Sum of even numbers: " + sum);
    }
}
