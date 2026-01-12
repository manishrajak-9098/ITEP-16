//5. Write a Java program to test if a hash set is empty or not.

import java.util.*;
public class HS5_Q53 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(11);
   set.add(12);
   set.add(13);
   set.add(14);
  System.out.println("HashSet List : "+set);
//   set.clear();
   if(set.isEmpty()){
       System.out.println("HashSet is Empty ");
       
   }else {
       System.out.println("HashSet Is not Empty ");
   }
    
    }
}
