package hashing;
import java.util.*;
public class FindSujm {
    public static void main(String[] args) {
        int arr[] ={8,3,4,2,5};
        int sum = 90;
        boolean flag= false;
        Set<Integer> s = new HashSet<>();
        for(int x: arr){
          if(s.contains(sum - x)){
            flag = true;
            System.out.println(flag);
            break;
          }else{
            s.add(x);
          }
        }
        System.out.println(flag);
    }
    
}
