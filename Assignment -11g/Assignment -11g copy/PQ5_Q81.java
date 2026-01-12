//5. Write a Java program to remove all elements from a priority queue.

 
import java.util.PriorityQueue;
import java.util.*;

import java.util.PriorityQueue;
import java.util.Collections;
class PQ5_Q81{
    public static void main(String args[]){
    PriorityQueue<String> colors=new PriorityQueue<>();
    Collections.addAll(colors,"Red","Green","Yellow","Pink","RoseGold");
    colors.offer("Blue");
    colors.offer("Black");
    System.out.println("Colors            : "+colors);
    colors.removeAll(colors);
        System.out.println("after removed : "+colors);
    }
}