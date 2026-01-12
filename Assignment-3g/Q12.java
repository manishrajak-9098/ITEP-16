// 12) Program to find out whether entered number is +ive or -ive



import java.util.Scanner;
class Q12{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no. ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println(" no. is positive : "+num);
        }
           else{
            System.out.println("no. is negative : "+num);
           }
            
        
    

    }
}