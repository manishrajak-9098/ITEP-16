//19. Write a Java program for trimming the capacity of an array list.

import java.util.*;
    public class AQ19{
    public static void main (String args[]){
         ArrayList<String> list = new ArrayList<>(10);        
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         list.add("Mani");
         System.out.println(" before arraylist Size : "+list.size());
         list.trimToSize();
         System.out.println("After trim  Size : "+list.size());

         
         
     
    }
    }

