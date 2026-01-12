//Q2. 1 2 3 ......n [limit]
import java.util.Scanner;
class Q2{
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
     
     int n = sc.nextInt();
     int i = 1;
     while (i<=n){
        System.out.print(i+"\t");
        i++;
     }
    }
}