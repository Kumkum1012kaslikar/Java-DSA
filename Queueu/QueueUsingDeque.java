package Queueu;
import java.util.*;
public class QueueUsingDeque {
     static class queue{
        Deque<Integer> de = new LinkedList<>();

         public void add(int data){
             de.addLast(data);
         }
         public int remove(){
            return de.removeFirst();
         }
         public int peek(){
            return de.getFirst();
         }

     }
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek : "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
