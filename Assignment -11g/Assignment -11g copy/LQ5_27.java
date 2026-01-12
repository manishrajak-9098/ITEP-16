//5. Write a Java program to insert the specified element at the specified position in the linked list

import java.util.*;
    public class LQ5_27{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         list.add("Html");
         System.out.println(" List : "+list);

         list.set(3, "c");
        System.out.println(" List : "+list);
        

         
    }
    }

