package hashing;
import java.util.*;


public class InserTwoElement {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30};
        int [] arr2 ={30,10};
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
         for(int i=0;i<arr1.length;i++){
           if( s.contains(arr1[i])){
               System.out.println(arr1[i]+" ");
           }
        }
    }
}
