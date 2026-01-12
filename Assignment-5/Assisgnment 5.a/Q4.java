//4) WAP to print table of a number.

 import java.util.Scanner;

class Q4{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter n..");
        int n = sc.nextInt();
        int table = 0;
        int i =1;
        for (i=1;i<=10;i++){
            table = n*i;
            System.out.println(table);
        }
    }
}

