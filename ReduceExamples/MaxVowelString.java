package ReduceExamples;

import java.util.*;

public class MaxVowelString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");

        String result = list.stream()
                .reduce("", (a, b) -> countVowels(a) > countVowels(b) ? a : b);

        System.out.println("Most vowels: " + result);
    }

    static int countVowels(String str) {
        return (int) str.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}