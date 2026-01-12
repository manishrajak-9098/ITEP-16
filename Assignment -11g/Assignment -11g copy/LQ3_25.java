//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.*;
    public class LQ3_25{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         list.add("Html");
         list.add("c");
         System.out.println("List : "+list);
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter A Specified Starting  position  ");
         int n =sc.nextInt();
          System.out.println("Elements are prints on THat Specific Elements ");
          for(int i = n; i<list.size();i++){
              System.out.println("Elements are  "+i+" :"+list.get(i));
              
          }   
      

         
    }
    }

