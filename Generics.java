import java.util.ArrayList;
import java.util.List;
public class Generics <e,v> {
         e id;
         v name;

         Generics(e id, v name){
            this.id= id;
            this.name= name;

         }

            e getId(){
            return id;
         }

            v getName() {
                return name;
            }


         public static void main(String[] args){


            Generics<Integer,String> g= new Generics<Integer,String>(12, "Abhay");
            System.out.println( "ID =" + g.getId() +  "Name = " + g.getName()) ;

         }
          
    }
    

