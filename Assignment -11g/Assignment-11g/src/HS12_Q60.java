//12. Write a Java program to remove all elements from a hash set.

import java.util.*;
public class HS12_Q60 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(1);
   set.add(2);
   set.add(13);
   set.add(4);
   set.add(5);
   set.add(13);
   System.out.println("HashSet : "+set);
   set.removeAll(set);
           System.out.println(" Remove all element from Hashset  "+set);
         
    }
}

