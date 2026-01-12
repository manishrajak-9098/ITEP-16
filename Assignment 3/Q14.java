

import java.util.Scanner;
class Q14{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("enter your percentage.");
    float percentage = sc.nextFloat();

if(percentage<60) {
        System.out.println("your grade is d, fail...");
    }
    else if(percentage>=60 && percentage<=80){
        System.out.println("your grade is c..");
    }
        
    else if(percentage>80 && percentage<=90){
        System.out.println("your grade is..b..");
    }
    else if(percentage>90){
        System.out.println("your grade is a.");
    
    }
  } 
}