import java.util.Scanner;
 class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("area");
        int area = sc.nextInt();

        System.out.println("base");
        int base = sc.nextInt();

        System.out.println("height");
        int height = sc.nextInt();

        double Coffient =(0.5)*(8*5);
        double y=area/Coffient;
        double x=Math.sqrt(y);
 
        System.out.println("Base "+(base*x));
        System.out.println("height "+(height*x));



    }
    
}
