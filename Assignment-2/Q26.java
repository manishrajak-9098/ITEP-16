import java.util.Scanner;
class Q26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("l_p");
        double l_p = sc.nextDouble();

        System.out.println("b of p");
        double b_p = sc.nextDouble();

        System.out.println("l of b ");
        double l_b = sc.nextDouble();

        System.out.println("b of b ");
        double b_b = sc.nextDouble();


        double number = (l_p*b_p)/(l_b*l_b);
        double path = l_p*b_p;
        double brick = l_b*b_b;
        double total_bricks = path/brick;
        System.out.println("total bricks  " + total_bricks);
    }
    
}
