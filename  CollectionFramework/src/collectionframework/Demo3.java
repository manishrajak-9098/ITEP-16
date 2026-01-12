import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;;

public class Demo3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> l= new ArrayList<>();
        System.out.println("Enter Size ");
        int n = sc.nextInt();
        System.out.println("Enter Elemrnts ");
        for(int i = 0; i<n; i++){
            l.add(sc.nextInt());
        }
       
        System.out.println("Elements "+l); 
    }
    
    
}
