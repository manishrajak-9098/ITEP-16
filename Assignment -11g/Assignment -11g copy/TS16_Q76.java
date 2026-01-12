// 16. Write a Java program to remove a given element from a tree set.
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Collections;
class TS16_Q76{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers=new TreeSet<>();
        Collections.addAll(numbers,1,2,6,35,2,63,9,563,25);
        System.out.println(" Treeset elements are : "+numbers);
        
        System.out.println("Enter a element for remove the element ");
        int num = sc.nextInt();
      
        if(numbers.remove(num)){
        System.out.println("Element remove from given set "+numbers);
        }
        else{
        System.out.println("Element not found in given set "+numbers);
    }  
        System.out.println("updated Treeset : "+numbers);
    }
    
}