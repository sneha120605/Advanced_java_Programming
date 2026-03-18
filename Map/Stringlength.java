import java.util.*;
import java.util.stream.*;

public class StringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream");

        List<Integer> result = list.stream()
                                  .map(String::length)
                                  .collect(Collectors.toList());

        System.out.println(result);
    }
}