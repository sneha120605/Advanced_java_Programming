package stream_api;
import java.util.*;
public class filter {
    public static void main(String[]args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(3);
        array.stream()
        .filter(n->n%3==0 && n%5!=0).forEach(System.out::println);

    }
}
