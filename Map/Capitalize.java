import java.util.*;
import java.util.stream.*;

public class Capitalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "java");

        List<String> result = list.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}