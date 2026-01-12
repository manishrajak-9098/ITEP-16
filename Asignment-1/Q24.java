class Q24 {
    public static void main(String[] args) {
        double l_wall = 20;
        double h_wall = 2;
        double thick_wall = 0.75;
        double con_len_into_cm = l_wall*100;
        double con_bre_into_cm = h_wall*100;
        double con_hei_into_cm = thick_wall*100;
        double wall_volume = con_len_into_cm*con_bre_into_cm*con_hei_into_cm;
        double l_brick = 25;
        double b_brick = 10;
        double thick_brick = 7.5;
        double brick_volume = l_brick*b_brick*thick_brick;
        double no_of_brick = wall_volume/brick_volume;
        double brick_cost_per_thousand = no_of_brick/1000;
        double doll_cost=brick_cost_per_thousand*900;
        System.out.println("dollar cost  "+ doll_cost);


    }
    
}
