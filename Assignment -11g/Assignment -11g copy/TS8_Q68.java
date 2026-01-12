//8. Write a Java program to compare two tree sets.


import java.util.*;

public class TS8_Q68  {
 
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        numbers.add(20);

        System.out.println("TreeSet elements: " + numbers);
     
       TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(10);
        numbers1.add(5);
        numbers1.add(25);
        numbers1.add(15);
        numbers1.add(20);
if(numbers.equals(numbers1)) {
    System.out.println("Both treeset are equals ");
}
       else {
    System.out.println("Both treeset are not equals");
}
         }
}
