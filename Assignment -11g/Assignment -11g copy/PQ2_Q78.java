//2. Write a Java program to iterate through all elements in the priority queue.

import java.util.PriorityQueue;
import java.util.*;

public class PQ2_Q78{
    public static void main(String[] args) {
        PriorityQueue<String> color = new PriorityQueue<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("White");
        color.add("Gray");
        color.add("Green");
        
       Iterator itr = color.iterator();
       
       while(itr.hasNext()){
           System.out.println("Elements are : "+itr.next());
           
       }
        
    }
}