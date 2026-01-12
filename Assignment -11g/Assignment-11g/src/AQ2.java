// 2. Write a Java program to iterate through all elements in an array list.
 import java.util.*;
public class AQ2{
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
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}