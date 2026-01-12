//24. Write a Java program to compare two linked lists.

import java.util.*;
    public class LQ24_46{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>(); 
       
         list.add(100);
         list.add(200);
         list.add(300);
      
         System.out.println("linkedList 1 : "+list);
      LinkedList list2 = new LinkedList<>();
         list2.add(100);
         list2.add(200);
//         list2.add(400);
         list.add(300);
        
        
        System.out.println("LinkedList : "+list2);
        System.out.println("\n Compare Both LinkedList \n equal aur not  : "+list.equals(list2));
       }


        
        
          
      
    }
    }

