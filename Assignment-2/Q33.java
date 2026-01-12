import java.util.Scanner;
public class Q33 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
          System.out.println("enter length");
        int l= sc.nextInt();
       
     System.out.println("enter breadth");
        int b= sc.nextInt();
        
        int ar = l*b;
        int path1 = 3*l;
        int path2 = 4*b;
        int res = ar-path1-path2;
        System.out.println("total usable area of garden is:"+res);
        }
}