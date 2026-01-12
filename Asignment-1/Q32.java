class Q32 {
    public static void main(String[] args) {
        int garden_side = 150;
        int pool_side = 25;
        int g_side_con_into_metersquare = garden_side*garden_side;
        int p_side_con_into_metersquare = pool_side*pool_side;

        int unable_area = g_side_con_into_metersquare-p_side_con_into_metersquare;
        System.out.println("area  "+unable_area);
    }
    
}
