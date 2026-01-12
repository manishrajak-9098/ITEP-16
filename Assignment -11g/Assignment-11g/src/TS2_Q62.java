//2. Write a Java program to iterate through all elements in a tree set.

import java.util.*;
public class TS2_Q62 {
    public static void main(String[] args) {
     TreeSet <String> set = new TreeSet<>();
   set.add("blue");
   set.add("black");
   set.add("Red");
   set.add("white");
   set.add("Pink");
   set.add("Green");
    Iterator itr = set.iterator();
    while(itr.hasNext()){
        System.out.println("Iterate All element : "+itr.next());
    }
    
    }
}

