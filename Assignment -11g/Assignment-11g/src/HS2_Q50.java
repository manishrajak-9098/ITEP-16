//1. Write a Java program to append the specified element to the end of a hash set.

import java.util.*;
public class HS2_Q50 {
    public static void main(String[] args) {
     HashSet <Integer> set = new HashSet<>();
     set.add(198);
     set.add(2);
     set.add(3);
     set.add(8);
     set.add(6);
     set.add(5);
    set.add(10);
    Iterator itr = set.iterator();
    while(itr.hasNext()){
        System.out.println("Iterate All element : "+itr.next());
    }
    }
}
