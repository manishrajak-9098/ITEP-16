import java.util.Scanner;
 class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("radius");
        double r = sc.nextDouble();

        System.out.println("height");
        double h = sc.nextDouble();

        double volume_cylinder = 3.14*r*r*h;
        System.out.println("volume of cylinder "+volume_cylinder);
    }
    
}
