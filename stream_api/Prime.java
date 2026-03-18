import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[]args){
        ArrayList<Integer>array=new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(3);
        array.stream().filter(n->isPrime(n)).forEach(System.out::println);
    }
}
