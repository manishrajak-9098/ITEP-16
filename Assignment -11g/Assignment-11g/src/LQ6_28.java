//6. Write a Java program to insert elements into the linked list at the first and last positions 
import java.util.*;
    public class LQ6_28{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         System.out.println(" List : "+list);
         list.addLast("Css");
         list.addFirst("Html");

        System.out.println(" List : "+list);
        

         
    }
    }

