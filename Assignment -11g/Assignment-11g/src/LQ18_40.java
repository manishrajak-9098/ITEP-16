//18. Write a Java program to copy a linked list to another linked list.

import java.util.*;
    public class LQ18_40{
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
        ArrayList<Integer> list1 = new ArrayList<>(list); 
      
           System.out.println("ArrayList : "+list1);

        
        
          
      
    }
    }

