 import java.util.Scanner;
 class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("edge a");
        int edge_a = sc.nextInt();

        System.out.println("length");
        int length = sc.nextInt();

        System.out.println("breadth");
        int breadth = sc.nextInt();

        System.out.println("heigth");
        int height = sc.nextInt();

        
        int cube_volume = (edge_a*edge_a*edge_a);
        int cuboid_volume = (length*breadth*height);
        System.out.println("cube volume "+ cube_volume);
        System.out.println("cuboid volume "+ cuboid_volume);



    }
    
}
