//3. Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;
import java.util.*;

public class PQ3_Q79{
    public static void main(String[] args) {
        PriorityQueue<String> color = new PriorityQueue<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        System.out.println("Elements of PriorityQueue 1 : "+color);
      
       PriorityQueue<String> color1 = new PriorityQueue<>();
         color1.add("Green");
         color1.add("White");
         color1.add("Gray");

       color.addAll(color1);
        System.out.println("\nAdd all elements od anaother PriorityQueue : "+color);

      
        
    }
}