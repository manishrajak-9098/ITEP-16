import java.util.*;

import java.util.Scanner;;

public class Demo6{
    public static void main (String args[]){
     
    
HashMap<Integer,String> map= new HashMap<>0);
map.put(101,"Soap");
map.put(102,"Fairness Cream");
HashMap<Integer,Map>innerMap= new HashMap<>();

innerMap.put(1001, map);
for(Map.Entry entry: innerMap.entrySet());
system.out-.println("Key: "entry.getKey()+" value:"+entry.getValue());
Object obj=(Map<Integer, String>)entry;
System.out.println(obj);
for(Map.Entry value:obj.entrySet());

        System.out.println("Elements "+e.getKey()+"  vlue"+e.getSet()); 
       
    }
    
}
    
