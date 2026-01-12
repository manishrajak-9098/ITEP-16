//19. Write a Java program to remove and return the first element of a linked list.

import java.util.*;
    public class LQ21_43{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>();        
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(400);
         list.add(500);
         list.add(600);
         list.add(700);
         System.out.println("LinkedList : "+list);
         int val = list.peekLast();
         System.out.println("last element : "+val);
         System.out.println("LinkedList : "+list);


        
        
          
      
    }
    }

