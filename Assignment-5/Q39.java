import java.util.Scanner;

class Q39{
public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter no.. ");
        int num = sc.nextInt();
        int sum=0;
        int count=0;

        while (num>0){
            count++;
           int  digit=num%10;
            int factorial= 1; 

            for(int i=1; i<=digit; i++){
                factorial=factorial*i;
            }
            num =num/10;

       sum=sum+factorial; 
        }

        if(sum == num){
            System.out.println("Number is strong");
        }
        else
        System.out.println("Number is NOT Strong");
}
}
