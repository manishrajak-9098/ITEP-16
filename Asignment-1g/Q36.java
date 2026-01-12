// 35) WAP to check whether entered number is perfect or not

import java.util.Scanner;
class Q36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

       for(i=1; i<=n/2; i++){
            if(n % i == 0){
              sum = sum+i;
            }
            
        }
        if(sum == n){
            System.out.println("Given number is perfect");
        }else{
            System.out.println("Given number is not perfect");
     }
   }
}
