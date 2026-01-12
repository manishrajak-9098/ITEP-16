//6. Write a Java program to remove the third element from an array list.
import java.util.*;
public class AQ7{
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
         String searchElement = "Black";
         if (list.contains(searchElement)){
             System.out.println("elements found in arrayList");
             
         }
         else{
         System.out.println("Elements not found");

    }
    }

}