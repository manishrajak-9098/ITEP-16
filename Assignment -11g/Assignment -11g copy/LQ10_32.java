//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.*;
    public class LQ10_32{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         list.add("Html");
         list.add("Hpp");
         list.add("Mani");
          
        System.out.println(" List : "+list.getFirst());
        System.out.println(" List : "+list.getLast());

    }
    }

