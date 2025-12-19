import java.util.ArrayList;
import java.util.List;

class ArrayListDemo3{
    public static void main(String[] args) {
        
        List list = new ArrayList<>();

        list.add(10);
        list.add(new DataInt(20,30));
        list.add(40);
        System.out.println(list);

    }
}