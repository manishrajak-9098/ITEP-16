class Q26 {
    public static void main(String[] args) {
        double l_p = 12000;
        double b_p = 240;
        double l_b = 24;
        double b_b = 15;
        double number = (l_p*b_p)/(l_b*l_b);
        double path = l_p*b_p;
        double brick = l_b*b_b;
        double total_bricks = path/brick;
        System.out.println("total bricks  " + total_bricks);
    }
    
}
