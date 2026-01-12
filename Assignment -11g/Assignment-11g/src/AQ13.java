//13. Write a Java program to compare two array lists.

import java.util.*;
    public class AQ13{
    public static void main (String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
      
        System.out.print("ArrayList"+list1);
        System.out.println();
           ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
      
        System.out.print("ArrayList"+list2);
                System.out.println();

      if(  list1.equals(list2)){
          System.out.println("Both list are Equals ");
         
      }else{
          System.out.println("list are not Equals");
      }

         System.out.println();

    }
    }

