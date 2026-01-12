//13. Write a Java program to remove the first and last elements from a linked list.

import java.util.*;
    public class LQ13_35{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         list.add("Html");
         list.add("Mani");
         System.out.println("List : "+list);
         list.removeFirst();
         list.removeLast();

        System.out.println("Elements are After Remove index 4 ");
         System.out.println(list);
        
          
      
    }
    }

