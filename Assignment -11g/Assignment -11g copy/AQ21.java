//21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.*;
    public class AQ21{
    public static void main (String args[]){
         ArrayList<String> list = new ArrayList<>(5);        
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         System.out.println(" arraylist : "+list);
         list.set(1,"Manish Rajak");
         System.out.println(" arraylist : "+list);

         
         
     
    }
    }

