import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        
       Queue<Integer> pq = new PriorityQueue<>();

       pq.add(10);
       pq.add(20);
       pq.add(40);
       pq.add(40);
       pq.add(50);

       System.out.println(pq);
       while(!pq.isEmpty()){
        System.out.println(pq.poll());
       }


    }
    
}
