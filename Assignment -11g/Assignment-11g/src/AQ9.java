//9. Write a Java program to copy one array list into another.
import java.util.*;
public class AQ9{
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
        ArrayList<Integer> list1 = new ArrayList<>(list);

         System.out.println("copy list : "+list1);

    }
    }

