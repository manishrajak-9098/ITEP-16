import java.util.Scanner;
class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("l of wall");
        double l_wall = sc.nextDouble();

        System.out.println("h of wall");
        double h_wall = sc.nextDouble();

        System.out.println("thick wal");
        double thick_wall = sc.nextDouble();

        
        double con_len_into_cm = l_wall*100;
        double con_bre_into_cm = h_wall*100;
        double con_hei_into_cm = thick_wall*100;
        double wall_volume = con_len_into_cm*con_bre_into_cm*con_hei_into_cm;

        System.out.println("l of brick");
        double l_brick = sc.nextDouble();

        System.out.println("b of brick");
        double b_brick = sc.nextDouble();

        System.out.println("thick brick");
        double thick_brick = sc.nextDouble();


        double brick_volume = l_brick*b_brick*thick_brick;
        double no_of_brick = wall_volume/brick_volume;
        double brick_cost_per_thousand = no_of_brick/1000;
        double doll_cost=brick_cost_per_thousand*900;
        System.out.println("dollar cost  "+ doll_cost);


    }
    
}
