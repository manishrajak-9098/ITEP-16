//8. Write a Java program to insert the specified element at the front of a linked list.

import java.util.*;
    public class LQ7_29{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         System.out.println(" List : "+list);
         list.addFirst("Html");
         
        System.out.println(" List : "+list);

    }
    }

