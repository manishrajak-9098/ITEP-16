//17. Write a Java program to empty an array list.

import java.util.*;
    public class AQ17{
    public static void main (String args[]){
         ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
      
    
  
        System.out.println();
        list1.clear();

         System.out.println("Empty ArrayList : "+list1);

    }
    }

