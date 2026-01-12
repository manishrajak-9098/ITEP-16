import java.util.Scanner;
class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("garden side");
        int garden_side = sc.nextInt();

         System.out.println("pool side");
        int pool_side = sc.nextInt();
        
        int g_side_con_into_metersquare = garden_side*garden_side;
        int p_side_con_into_metersquare = pool_side*pool_side;

        int unable_area = g_side_con_into_metersquare-p_side_con_into_metersquare;
        System.out.println("area  "+unable_area);
    }
    
}
