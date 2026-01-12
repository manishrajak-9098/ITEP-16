// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.*;
public class AQ1{
    public static void main (String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Red");
        list.add("Purple");
        list.add("Blue");
        list.add("Nion");
        System.out.println("ArrayList"+list);
    }

}
