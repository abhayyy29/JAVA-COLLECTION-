import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[]args){
    ArrayList list = new ArrayList<>();

       DataInt ab = new DataInt();
       list.add(ab);

       list.add(new DataInt(3,2));

       for(int i=0; i<list.size();i++){
        DataInt ob = (DataInt) list.get(i);
        
        System.out.println(ob.a);
        System.out.println(ob.b);
       }
}
}