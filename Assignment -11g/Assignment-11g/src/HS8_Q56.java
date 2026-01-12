//8. Write a Java program to convert a hash set to a tree set.

import java.util.*;
public class HS8_Q56 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(11);
   set.add(12);
   set.add(13);
   set.add(14);
   set.add(145);
   set.add(13);
   System.out.println("HashSet List : "+set);
       TreeSet<Integer> set1 = new TreeSet<>();
   Iterator <Integer> itr = set.iterator();
   while(itr.hasNext()){
       set1.add(itr.next());
   }
//   TreeSet tset = new TreeSet(set);
        System.out.println("convert into Tree Set "+set1);
   
 
  
    }
}

