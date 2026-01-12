//6. Write a Java program to clone a tree set list to another tree set.


import java.util.*;

public class TS6_Q66  {
 
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        numbers.add(20);

        System.out.println("TreeSet elements: " + numbers);
     
       TreeSet<Integer> numbers1 = new TreeSet<>(numbers);
        System.out.println("clone set : "+numbers1);

    }
}
