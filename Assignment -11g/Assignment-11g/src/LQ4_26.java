//4. Write a Java program to iterate a linked list in reverse order.

import java.util.*;
    public class LQ4_26{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         list.add("Html");
         list.add("c");
        System.out.println(" List : "+list);

//        Collections.reverse(list);
        for(int i =list.size()-1; i>=0;i--){
            
        System.out.println("REverse List : "+list.get(i));
        }
      

         
    }
    }

