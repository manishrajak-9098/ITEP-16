//1 - 2 + 3 - 4 + 5 - 6 ....n......sum  

import java.util.Scanner;

class Q5{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int i = 1,sum=0;
      while( i<=n){  
        if(i%2 == 0){
          sum = sum - i;
        }   
        else{
          sum = sum + i;
        }   
          i++;
      } 
      System.out.println("Sum : "+sum);
    }
}