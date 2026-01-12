//17. Write a Java program to join two linked lists.

import java.util.*;
    public class LQ17_39{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>();        
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(400);
         list.add(500);
         list.add(600);
         list.add(700);
         System.out.println("List : "+list);
         LinkedList<Integer> list1 = new LinkedList<>(); 
         list1.add(34);
         list1.add(242);
         list1.add(454);
         list1.add( 45);
         list1.add(454);
        list.addAll(list1);
           System.out.println("List : "+list);

        
        
          
      
    }
    }

