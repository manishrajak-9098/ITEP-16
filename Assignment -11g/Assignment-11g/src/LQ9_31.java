//9. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.*;
    public class LQ9_31{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         System.out.println(" List : "+list);
         list.set(2,"Html");
         list.set(4,"Hpp");
         list.set(3,"Mani");
         list.set(1,"Rajak");

         
        System.out.println(" List : "+list);

    }
    }

