//1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
import java.util.PriorityQueue;
public class PQ1_Q77{
    public static void main(String[] args) {
        PriorityQueue<String> color = new PriorityQueue<>();
        color.add("Red");
        color.add("Blue");
        color.add("Black");
        color.add("White");
        color.add("Gray");
        color.add("Green");
        
        System.out.println("Elements of priorityQueue : "+color);

        
    }
}