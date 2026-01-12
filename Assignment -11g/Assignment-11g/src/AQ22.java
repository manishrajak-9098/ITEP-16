//22. Write a Java program to print all the elements of an ArrayList using the elements' position.

import java.util.*;
    public class AQ22{
    public static void main (String args[]){
         ArrayList<String> list = new ArrayList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         list.add("Html");
         
         System.out.println("Elements are prints on THat Specific Elements ");
          for(int i = 0; i<list.size();i++){
              System.out.println("Elements are  "+i+" :"+list.get(i));
              
          }   
    }
    }

