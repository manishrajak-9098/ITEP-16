//20. Write a Java program to increase an array list size.

import java.util.*;
    public class AQ20{
    public static void main (String args[]){
         ArrayList<String> list = new ArrayList<>(5);        
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         System.out.println(" arraylist : "+list);
         System.out.println(" arraylist : "+list.size());
         list.add("mani");
         System.out.println(" arraylist : "+list);
         System.out.println("After   Size : "+list.size());

         
         
     
    }
    }

