//7. Write a Java program to convert a hash set to an array.

import java.util.*;
public class HS7_Q55 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
   set.add(11);
   set.add(12);
   set.add(13);
   set.add(14);
   set.add(145);
   set.add(13);
   System.out.println("HashSet List : "+set);
   
   Integer arr[] = new Integer[set.size()];
//   for(int i=0; i<arr.length;i++){
        set.toArray(arr);
//   }
        System.out.println("Elements are ");
        for(int element :arr){
            System.out.println("Array : "+element);
        }
  
    }
}

