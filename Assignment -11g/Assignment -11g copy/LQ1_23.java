//1. Write a Java program to append the specified element to the end of a linked list.

import java.util.*;
    public class LQ1_23{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         System.out.println("LinkedList : "+list);
         System.out.println("Elements are to be Append ");
         list.addLast("Html");
         list.addFirst("c");
         System.out.println("After Append LinkedList : "+list);

         
    }
    }

