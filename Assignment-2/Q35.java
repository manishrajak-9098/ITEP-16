import java.util.Scanner;
class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("radius");
    double r = sc.nextDouble();

    System.out.println("heigth");
    double h = sc.nextDouble();

    double area;
    area = 2*Math.PI*r*(h+r);
    System.out.println("area  "+ area);
    }
    
}
