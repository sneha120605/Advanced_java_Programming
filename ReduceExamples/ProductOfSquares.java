package ReduceExamples;

import java.util.*;

public class ProductOfSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int result = list.stream()
                .map(n -> n * n)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of squares: " + result);
    }
}
