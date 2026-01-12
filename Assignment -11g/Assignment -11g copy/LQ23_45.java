//23. Write a Java program to convert a linked list to an array list.

import java.util.*;
    public class LQ23_45{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>(); 
       
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(400);
         list.add(500);
         list.add(600);
         list.add(700);
         System.out.println("linkedList : "+list);
        ArrayList list2 = new ArrayList<>(list);
        System.out.println("ArrayList : "+list2);
       }


        
        
          
      
    }
    }

