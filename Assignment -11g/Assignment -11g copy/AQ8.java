//8. Write a Java program to sort a given array list.
import java.util.*;
public class AQ8{
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(97);
        list.add(34);
        list.add(433);
        list.add(343);
        list.add(77);
        list.add(88);
        System.out.print("ArrayList"+list);
        System.out.println();
        
       Collections.sort(list);
         System.out.print("Sorted list : "+list);

    }
    }

}