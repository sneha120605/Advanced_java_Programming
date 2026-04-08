package ReduceExamples;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");

        String longest = list.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Longest string: " + longest);
    }
}