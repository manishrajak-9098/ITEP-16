//12. Write a Java program to remove a specified element from a linked list.

import java.util.*;
    public class LQ12_34{
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
         list.remove(4);
         System.out.println("");
        System.out.println("Elements are After Remove index 4 "+list);
          
      
    }
    }

