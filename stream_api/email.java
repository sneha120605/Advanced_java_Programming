package stream_api;
import java.util.*;
public class email {
    public static void main(String[]args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("sneha123@gmail.com");
        arr.add("jyoti123@gmail.com");
        arr.add("xyz");
        arr.stream().filter(n->n.contains("@")&&n.contains(".")).forEach(System.out::println);
    }
}
