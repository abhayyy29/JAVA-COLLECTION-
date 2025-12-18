import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args){

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerLast(20);
        q.offerFirst(30);
        
        System.out.println(q);
        System.out.println(q.pollLast());
        System.out.println(q.peek());
         System.out.println(q);

        }
    
}
