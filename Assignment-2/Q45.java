import java.util.Scanner;
class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("a1");
        int a1 = sc.nextInt();

        System.out.println("a2");
        int a2 = sc.nextInt();

        System.out.println("n");
        int n = sc.nextInt();
        
        int d = a2-a1;
       
        int Sn = (n/2)*(2*a1+(n-1)*d);
        System.out.println("sum  "+ Sn);

    }
    
}
