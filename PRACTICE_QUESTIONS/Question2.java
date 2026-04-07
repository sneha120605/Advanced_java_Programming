package PRACTICE_QUESTIONS;
//write a program to multiply all the elements in a list using the reduce() method
import java.util.*;
class Question2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}