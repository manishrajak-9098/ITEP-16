//Q5. 1 3 5 7 9 .....n-Terms
import java.util. Scanner;
class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();

        int i=1;
             for (i=1; n!=0; n-- ){
            System.out.println(i);

            i = i+2;
        }
    }
}