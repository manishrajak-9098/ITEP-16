import java.util.Scanner;
class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("l of brick");
        int l_brick = sc.nextInt();

        System.out.println("b of brick");
        int b_brick = sc.nextInt();

        System.out.println("bricks");
        int bricks = sc.nextInt();

        int area = bricks*(b_brick*l_brick);
        System.out.println("area  " + area);


    }
    
}
