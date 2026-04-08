package ReduceExamples;

import java.util.*;

public class MaxUsingReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Max: " + max);
    }
}