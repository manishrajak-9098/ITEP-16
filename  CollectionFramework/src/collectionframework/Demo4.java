import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;;
class Student {
    int no;
    String name;
    double per;
    public Student (int no, String name, double per){
        this.no = no;
        this.name = name;
        this.per = per;


        //@override
        public String toString(){
            return "{"+no+","+name+","+per+"}";
        }
    }
}

public class Demo3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        Student s1 = new Student(111, "mani", 99.9);
        Student s2 = new Student(112, "hitesh", 99.9);
        Student s3 = new Student(113, "udit", 99.9);
        ArrayList <Integer > l= new ArrayList<>();
     
        System.out.println("Elements "+l); 
    }
    
    
}
