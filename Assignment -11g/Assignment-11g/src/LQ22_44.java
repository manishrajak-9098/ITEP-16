//22. Write a Java program to check if a particular element exists in a linked list.

import java.util.*;
    public class LQ22_44{
    public static void main (String args[]){
         LinkedList<Integer> list = new LinkedList<>(); 
         Scanner sc = new Scanner(System.in);
         list.add(100);
         list.add(200);
         list.add(300);
         list.add(400);
         list.add(500);
         list.add(600);
         list.add(700);
         System.out.println("linkedList : "+list);
         System.out.println("search Element ");
         int n =sc.nextInt();
       if (list.contains(n)){
           System.out.println("exist in LinkedList ");
       }
       else{
          System.out.println("not exist in LinkedList ");

       }


        
        
          
      
    }
    }

