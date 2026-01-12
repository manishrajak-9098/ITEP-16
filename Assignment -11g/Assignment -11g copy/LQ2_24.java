//2. Write a Java program to iterate through all elements in a linked list.

import java.util.*;
    public class LQ2_24{
    public static void main (String args[]){
         LinkedList<String> list = new LinkedList<>();        
         list.add("Java");
         list.add("C++");
         list.add("Python");
         list.add("Css");
         list.addLast("Html");
         list.addFirst("c");
         Iterator itr = list.iterator();
         while(itr.hasNext()){
             System.out.println("LinkedList : "+itr.next());
         }

         
    }
    }

