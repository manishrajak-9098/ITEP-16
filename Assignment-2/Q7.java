import java.util.Scanner;
 class Q7 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("breadth");
    int breadth = sc.nextInt();

    System.out.println("area of triangle");
    int area_of_triangle = sc.nextInt();


    int height;
    height = 2*area_of_triangle/breadth;
    System.out.println("height " + height);
    }
    
}

