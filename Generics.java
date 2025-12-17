import java.util.ArrayList;
import java.util.List;
public class Generics {
    public static void main(String[] args){
        List<DataInt> l = new ArrayList<DataInt>();
            l.add(new DataInt());
            l.add(new DataInt(7,9));
            for(int i=0; i<l.size();i++){
                DataInt ob = l.get(i);
                System.out.println(ob.a);
                System.out.println(ob.b);
            }
    }
    
}
