package ReduceExamples;

import java.util.*;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API");

        String result = list.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated: " + result);
    }
}