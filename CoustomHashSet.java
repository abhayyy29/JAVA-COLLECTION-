import java.util.HashSet;
import java.util.Set;

public class CoustomHashSet {
    public static void main(String[] args) {
        
        Set<Student> set = new HashSet<>();

        set.add(new Student (1, "Abhay")); 
        set.add(new Student(1, "Flower"));
        set.add(new Student(2, "Soyam"));

       
            System.out.println(set);
        }

    }
    

