//5. Write a Java program to get the first and last elements in a tree set.

import java.util.*;

public class TS5_Q65  {
 
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        numbers.add(20);

        System.out.println("TreeSet elements: " + numbers);
        int first = numbers.first();

        int last = numbers.last();

        System.out.println("First (smallest) element: " + first);
        System.out.println("Last (largest) element: " + last);
    }
}
