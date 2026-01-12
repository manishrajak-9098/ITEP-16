//8. Write a Java program to insert the specified element at the last of a linked list.

import java.util.*;
    public class LQ8_30{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         System.out.println(" List : "+list);
         list.addLast("Html");
         
        System.out.println(" List : "+list);

    }
    }

