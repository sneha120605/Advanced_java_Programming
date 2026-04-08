package ReduceExamples;

import java.util.*;

public class MinUsingReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5);

        int min = list.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        System.out.println("Min: " + min);
    }
}
