import java.util.Scanner;
class Q34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("base 1");
        int base1 = sc.nextInt();

        System.out.println("base2");
        int base2 = sc.nextInt();

        System.out.println("height");
        int h = sc.nextInt();
        
        int a_trape = 1/2*base1+base2*h/2;
        int walk_away_area = 4*h;
        int total_area = a_trape + walk_away_area;
    System.out.println("total_area  " + total_area );
    }
    
}
