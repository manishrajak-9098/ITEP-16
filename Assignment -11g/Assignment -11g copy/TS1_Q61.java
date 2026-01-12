//1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.


import java.util.*;
public class TS1_Q61 {
    public static void main(String[] args) {
     TreeSet <String> set = new TreeSet<>();
   set.add("blue");
   set.add("black");
   set.add("Red");
   set.add("white");
   set.add("Pink");
   set.add("Green");
   System.out.println("TreeSet : "+set);
  
    }
}

