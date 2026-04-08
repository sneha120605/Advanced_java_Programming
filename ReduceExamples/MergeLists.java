package ReduceExamples;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> merged = lists.stream()
                .reduce(new ArrayList<>(), (a, b) -> {
                    a.addAll(b);
                    return a;
                });

        System.out.println("Merged List: " + merged);
    }
}
