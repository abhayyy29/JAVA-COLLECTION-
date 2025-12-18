import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "England");
        map.putIfAbsent("us", "USA");
        map.remove("us", "USA");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values =  map.values();
        System.out.println(values);




        System.out.println(map);
        System.out.println(map.get("us"));

    }
    
}
