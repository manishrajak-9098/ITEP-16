import java.util.Scanner;
class Q42{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value b1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter value b2 : ");
        int n2 = sc.nextInt();
        int n3 = 0;

        while(n2!= 0){

            n3 = n1 % n2;
            n1 = n2;
            n2 = n3;


        }
        // System.out.println(n1);
        // System.out.println(n2);

        if( n1 >= n2){
            System.out.println("HCF is : " + n1);
        }
        else{
        System.out.println("HCF is : " + n2);

        }




        
   }
}