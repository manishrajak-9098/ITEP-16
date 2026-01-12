//26. Write a Java program to replace an element in a linked list.

import java.util.*;
    public class LQ26_48{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>(); 
       
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(100);
         list.add(200);
         list.add(400);
         list.add(300);
        System.out.println("Before rep lacein LinkedList :\n "+list);  
         list.set(2,454);    
        System.out.println("After replace in LinkedList of index 2 : \n"+list);  

    }
    }

