//14. Write a Java program to remove all elements from a linked list.

import java.util.*;
    public class LQ14_36{
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
         list.removeAll(list);
        

        System.out.println("After Remove All ");
         System.out.println(list);
        
          
      
    }
    }

