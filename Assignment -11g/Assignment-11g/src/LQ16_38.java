//16. Write a Java program to shuffle elements in a linked list.

import java.util.*;
    public class LQ16_38{
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
         Collections.shuffle(list);
        System.out.println("After Shufling  ");
         System.out.println(list);
        
          
      
    }
    }

