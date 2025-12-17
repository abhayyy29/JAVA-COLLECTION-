import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[]args){
    ArrayList list = new ArrayList<>();

       DataInt ab = new DataInt();
       list.add(ab);

       list.add(new DataInt(3,2));
       list.add(new DataCat());

       for(int i=0; i<list.size();i++){
        Object o = list.get(i);
       if(o instanceof DataInt){
          DataInt ob1 = (DataInt) o;
          System.out.println(ob1.a);
          System.out.println(ob1.b);
       }
       if(o instanceof DataCat){
        DataCat c = (DataCat) o;
        System.out.println(c.a);
       }
}
}
}