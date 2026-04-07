//print only the first 5 even number from the list

package Lazy_funtions;
import java.util.*;
public class ques01 {
    public static void main(String[] args) {
        List<Integer> list=List.of(11,22,33,44,55,66,77,88,99,100);
        list.stream().filter(n->n%2==0).limit(5).forEach(n->System.out.println(n));
    }
}

