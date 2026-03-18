import java.util.*;
public class Salary {
    public static void main(String[]args){
        ArrayList<Integer>array=new ArrayList<>();
        array.add(100000);
        array.add(300000);
        array.add(400000);
        array.add(500000);
        array.stream().filter(n->n>50000).forEach(System.out::println);
    }
}
