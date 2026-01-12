import java.util.ArrayList;

import java.util.List;

public class Demo2 {
    public static void main (String args[]){
        ArrayList <Integer> l= new ArrayList<>();
        l.add(100);
        l.add(100 );
        l.add(300);
        l.add(1);
        l.remove(1);
        System.out.println("Elements "+l);
    }
    
    
}
