package Lazy_funtions;
import java.util.*;
public class ques06 {
    public static void main(String[] args) {
        List<Integer>list=List.of(11,11,11,22,22,33,44,55,66,66,77,77,88,99,100);
        list.stream().distinct().skip(2).forEach(n->System.out.println(n));
    }
}
