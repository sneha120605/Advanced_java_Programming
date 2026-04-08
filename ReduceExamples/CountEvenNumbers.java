package ReduceExamples;

import java.util.*;

public class CountEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int count = list.stream()
                .reduce(0, (c, n) -> n % 2 == 0 ? c + 1 : c);

        System.out.println("Even count: " + count);
    }
}