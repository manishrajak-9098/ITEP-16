 import java.util.Scanner;
 class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("length");
    int length = sc.nextInt();

    System.out.println("breadth");
    int breadth = sc.nextInt();

    System.out.println("side");
    int side = sc.nextInt();
    
    int diff;
    int area_of_rectangle = (length*breadth);
     int area_of_square = (side*side);
     diff = (area_of_square - area_of_rectangle);
    System.out.println("a of rectangle "+ area_of_rectangle);
    System.out.println("a of sq "+ area_of_square);
    System.out.println("diff "+ diff);

}
 }