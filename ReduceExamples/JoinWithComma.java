package ReduceExamples;

import java.util.*;

public class JoinWithComma {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        String result = list.stream()
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

        System.out.println(result);
    }
}