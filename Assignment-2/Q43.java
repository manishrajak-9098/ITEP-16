import java.util.Scanner;
class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("radius");
        int r = sc.nextInt();

        System.out.println("height");
        int h = sc.nextInt();

        System.out.println("rate");
        int rate = sc.nextInt();
        
        double base_area = 3.14*r*r;
        double cost = base_area*rate;
        System.out.println("cost "+cost);

    }
    
}
