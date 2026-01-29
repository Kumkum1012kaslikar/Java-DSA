package hashing;
import java.util.*;

public class UnionOfTwo {
    public static void main(String[] args) {
        int a[] ={10,30,10,40};
        int b[] = {40, 5, 10, 15};

        Set<Integer> h = new HashSet<>();
         for(int x : a){
            h.add(x);
         }
          for(int x : b){
            h.add(x);
         }
         System.out.println(h.size());
    }
}
