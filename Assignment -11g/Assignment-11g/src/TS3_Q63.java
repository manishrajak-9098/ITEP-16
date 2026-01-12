//3. Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.*;

public class TS3_Q63 {
    public static void main(String[] args) {
        
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");

        System.out.println("First TreeSet: " + set1);
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Yellow");
        set2.add("Black");

        System.out.println("Second TreeSet : " + set2);
        set2.addAll(set1);

        System.out.println("Both TreeSet  : " + set2);
    }
}
