//5. Write a Java program to update an array element by the given element.
import java.util.*;
public class AQ5{
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
         list.set(3,"409");
         System.out.println("ArrayList"+list);

    }

}