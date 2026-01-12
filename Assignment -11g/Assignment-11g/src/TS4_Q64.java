//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.


import java.util.*;

public class TS4_Q64 {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original TreeSet: " + colors);

        TreeSet<String> reverseColors = (TreeSet<String>) colors.descendingSet();

        System.out.println("Reverse order view: " + reverseColors);
    }
}
