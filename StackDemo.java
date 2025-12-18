import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){

        Stack<String> list = new Stack<>();

        list.push("10");
        list.push("20");
        list.push("30");
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.peek());
    }
    
}
