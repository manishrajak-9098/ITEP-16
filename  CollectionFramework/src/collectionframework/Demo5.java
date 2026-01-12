import java.util.*;

import java.util.Scanner;;

public class Demo5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        // Set <Integer> set = new HashSet<>();
        HashSet <Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(300);
        set.add(500);
        set.add(null);
        System.out.println("Elements "+set); 
        System.out.println("Elements "+Collections.max(set)); 
        System.out.println("Elements "+Collections.min(set)); 
        List <Integer> list = new ArrayList<>(set);
//        Collections.sort(list);C
                System.out.println("Elements "+list); 

        System.out.println("");
        
    }
    
    
}
