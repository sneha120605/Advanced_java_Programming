package ReduceExamples;

import java.util.*;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int sum = list.stream()
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares: " + sum);
    }
}