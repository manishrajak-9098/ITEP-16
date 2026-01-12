import java.util.Scanner;
class Q44 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("a");
        int a= sc.nextInt();

        System.out.println("b");
        int b= sc.nextInt();

        System.out.println("n");
        int n = sc.nextInt();
        
        int diff= b-a;
        int tn = (a+(n-1)*diff);
        System.out.println("t28  "+tn);
    }
    
}
