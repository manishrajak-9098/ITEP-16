//11. Write a Java program to display elements and their positions in a linked list.

import java.util.*;
    public class LQ11_33{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add( "c");
         list.add("Css");
         list.add("Html");
         list.add("Hpp");
         list.add("Mani");
         for(int i =0 ; i<list.size();i++){
             System.out.println("Elements at index : "+i+" "+list.get(i));
         }
          
      
    }
    }

