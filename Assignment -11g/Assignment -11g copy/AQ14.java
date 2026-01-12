//14. Write a Java program that swaps two elements in an array list.

import java.util.*;
    public class AQ14{
    public static void main (String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        list1.add(600);
        list1.add(700);

      
        System.out.print("Before Swap : "+list1);
        System.out.println();
        Collections.swap(list1, 3, 6);

         System.out.println("After Swap : "+list1);

    }
    }

