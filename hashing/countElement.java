package hashing;

import java.util.*;

public class countElement {
    public static void main(String[] args){
       
    // int [] arr = {10,20,10,20,30};

    // HashSet<Integer> s = new HashSet<>();
//     for(int i=0;i<arr.length;i++){
//         s.add(arr[i]);
    
//     }
//    System.out.println(s.size());


   //improved way
    Integer [] arr = {10,20,10,20,30};
    HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
   
   System.out.println(s.size());

    }

    
}
