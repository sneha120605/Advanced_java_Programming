// write a java program that uses the reduce() method to find the sum of all elements in a list of integers.
import java.util.*;
class Question{
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
