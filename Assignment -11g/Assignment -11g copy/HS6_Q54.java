//6. Write a Java program to clone a hash set to another hash set.

import java.util.*;
public class HS6_Q54 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(11);
   set.add(12);
   set.add(13);
   set.add(14);
   set.add(145);
   set.add(13);

  System.out.println("HashSet List : "+set);
    
  HashSet <Integer > set1 = new HashSet<>(set);
        System.out.println("Clone of Hash : "+set1);
    }
}

