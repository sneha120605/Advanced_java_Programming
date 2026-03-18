import java.util.*;
import java.util.stream.*;

public class UpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream");

        List<String> result = list.stream()
                                 .map(String::toUpperCase)
                                 .collect(Collectors.toList());

        System.out.println(result);
    }
}