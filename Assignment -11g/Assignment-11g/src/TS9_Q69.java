//9. Write a Java program to find numbers less than 7 in a tree set.

import java.util.*;

public class TS9_Q69  {
 
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(25);
        numbers.add(4);
        numbers.add(20);
        numbers.add(5);
        numbers.add(1);
        numbers.add(30);
       Iterator <Integer> itr = numbers.iterator();
 
 while(itr.hasNext()){
     int num = itr.next();
     if(num<7){
         System.out.println("number of less than 7 : "+num);
     }
 }
    }
}
