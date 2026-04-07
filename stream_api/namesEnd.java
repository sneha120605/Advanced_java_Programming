package stream_api;
import java.util.*;
public class namesEnd {
    public static void main(String[]args){
        ArrayList<String>array=new ArrayList<>();
        array.add("sneha");
        array.add("riya");
        array.add("aman");
        array.stream().filter(n->n.endsWith("n")).forEach(System.out::println);
    }
}
