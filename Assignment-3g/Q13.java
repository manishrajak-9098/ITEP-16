// 13) Program to check whether entered number is divisible by 75 or not


import java.util.Scanner;
class Q13{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no. ");
        int num = sc.nextInt();

        if(num%75==0){
            System.out.println(" no. is divisible : ");
        }
           else{
            System.out.println("no. is not  divisible  : ");
           }
            
        
    

    }
}