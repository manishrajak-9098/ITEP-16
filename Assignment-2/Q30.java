import java.util.Scanner;
class Q30 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("l of tile");
        int l_tile = sc.nextInt();

        System.out.println("b of tile");
        int b_tile =sc.nextInt();

        System.out.println("l of floor");
        int l_floor = sc.nextInt();

        System.out.println("b of floor");
        int b_floor = sc.nextInt();

        int floor = l_floor*b_floor;
        int tile = l_tile*b_tile;
        int total_tile = floor/tile;
        System.out.println("tiless  "+total_tile);
    }
}
