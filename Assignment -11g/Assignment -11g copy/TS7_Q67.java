//7. Write a Java program to get the number of elements in a tree set.

import java.util.*;

public class TS7_Q67  {
 
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        numbers.add(20);

        System.out.println("TreeSet elements: " + numbers);
     
       int count = numbers.size();
        System.out.println("Numbers of elements  : "+count);

    }
}
