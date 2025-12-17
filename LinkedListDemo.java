import java.util.LinkedList;
class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(15);
        list.removeLast();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}