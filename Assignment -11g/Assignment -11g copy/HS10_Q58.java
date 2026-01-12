//10. Write a Java program to compare two hash set..

import java.util.*;
public class HS10_Q58 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(1);
   set.add(2);
   set.add(13);
   set.add(4);
   set.add(5);
   set.add(13);
   System.out.println("HashSet : "+set);
    HashSet <Integer> set1 = new HashSet<>();
   set1.add(1);
   set1.add(2);
   set1.add(13);
   set1.add(4);
   set1.add(5);
   set1.add(13);
  
   if( set.equals(set1)){
        System.out.println("Hash set are equals ");
    }
   else{
           System.out.println("Hashset are not equals ");
           }

  
    }
}

