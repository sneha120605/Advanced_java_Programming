package ReduceExamples;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";

        String reversed = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);

        System.out.println("Reversed: " + reversed);
    }
}
