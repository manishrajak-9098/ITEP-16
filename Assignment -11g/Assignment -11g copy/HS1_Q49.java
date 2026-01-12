//1. Write a Java program to append the specified element to the end of a hash set.

import java.util.*;
public class HS1_Q49 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(null);
     set.add(5);
     set.add(6);
     System.out.println("Before Append HashSet : "+set);
     set.add(100);
     System.out.println("After Append HashSet : "+set); 
    }
}
