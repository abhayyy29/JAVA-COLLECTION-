import java.util.Objects;

public class Student {
    int rollno;
    String name;

       Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    

     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return rollno == student.rollno &&
               Objects.equals(name, student.name);
    }

    
    public int hashCode() {
        return Objects.hash(rollno, name);

    }

    public String toString(){
         return "Student{" + "rollno" + rollno + "name" + name + "'}";
            
    }
}


