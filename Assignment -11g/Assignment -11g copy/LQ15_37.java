//15. Write a Java program that swaps two elements in a linked list.

import java.util.*;
    public class LQ15_37{
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
         Collections.swap(list, 3, 5);
        System.out.println("After Swaping index 3 and 5 ");
         System.out.println(list);
        
          
      
    }
    }

