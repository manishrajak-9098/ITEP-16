//9. Write a Java program to find numbers less than 7 in a tree set.

import java.util.*;
public class HS9_Q57 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(1);
   set.add(2);
   set.add(13);
   set.add(4);
   set.add(5);
   set.add(13);
   System.out.println("HashSet : "+set);
 Iterator <Integer> itr = set.iterator();
 
 while(itr.hasNext()){
     int num = itr.next();
     if(num<7){
         System.out.println("Set of less than 7 : "+num);
     }
 }
  
    }
}

