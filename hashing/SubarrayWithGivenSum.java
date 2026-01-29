package hashing;
import java.util.*;

public class SubarrayWithGivenSum {
    public static void main(String [] args){
        int []arr= {5,3,2,-1};
        int sum = 4;
        int presum =0;
      Set<Integer> h = new HashSet<Integer>();
        for(int x : arr){
            presum += x;       
            if(presum == sum){
                System.out.println("true");
                break;
            }else if (h.contains(presum-sum)){
                System.out.println("true");
                break;
            }
            h.add(presum);
         }
        
    }
}
