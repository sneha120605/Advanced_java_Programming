package Lazy_funtions;
import java.util.*;
public class ques03 {
    public static void main(String[] args) {
        List<Integer> list=List.of(11,11,22,33,44,55,66,77,88);
        long result=list.stream().distinct().count();
        System.out.println(result);
    }
}
