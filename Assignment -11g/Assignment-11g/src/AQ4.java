//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
public class AQ4{
    public static void main (String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Red");
        list.add("101");
        list.add("Purple");
        list.add("Black");
        list.add("108");
        list.add("Nion");
        System.out.println("ArrayList"+list);
        System.out.println();
         list.remove(0);
         System.out.println("ArrayList"+list);

    }

}