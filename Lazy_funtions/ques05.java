package Lazy_funtions;
import java.util.*;
public class ques05 {
    public static void main(String[] args) {
        List<Integer>list=List.of(11,22,33,44,55,66,77,88,99,100);
        list.stream().skip(2).limit(3).forEach(n->System.out.println(n));
    }
}
