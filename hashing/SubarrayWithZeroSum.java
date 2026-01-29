package hashing;
import java.util.*;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] ={-3,4,-3,-1,1};
        int pre_sum= 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            pre_sum += arr[i];
            if(h.contains(pre_sum)){
                System.out.println("true");
            }else if(pre_sum == 0){
                System.out.println("true");
            }
            h.add(pre_sum);
        }
    }
    
}
