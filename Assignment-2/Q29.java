import java.util.Scanner;
class Q29 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("length");
        int l = sc.nextInt();

        System.out.println("breadth");
        int b = sc.nextInt();

        System.out.println("side");
        int side = sc.nextInt();


        int area_of_floor = l*b;
        int area_of_tile = side*side;
        int no_of_tile = area_of_floor/area_of_tile;
        System.out.println("tiless  " +no_of_tile);
    }
    
}
