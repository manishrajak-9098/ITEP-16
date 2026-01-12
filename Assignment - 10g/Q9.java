// 9. Create a class that checks whether a given number is prime or not using Runnable interface

import java .util.*;
class Prime implements Runnable{
    int n;
    int count;
    Prime(int n ){
        this.n = n;
    }
    public void run(){

        for(int i = 1; i<=n/2 ; i++){
            if(n%i==0)
            count++;
        }
        if(count==1){
            System.out.println("Its a prime Number");
        }
        else{
            System.out.println("Its not a prime Number");

        }

    }
}

public class Q9{
   public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no.");
    int n = sc.nextInt();
    Prime p = new Prime(n);
    Thread th = new Thread (p);
    th.start();

   }
}