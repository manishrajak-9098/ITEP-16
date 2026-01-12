class Q30 { 
    public static void main(String[] args) {
        int l_tile = 5;
        int b_tile = 8;
        int l_floor = 200;
        int b_floor = 400;
        int floor = l_floor*b_floor;
        int tile = l_tile*b_tile;
        int total_tile = floor/tile;
        System.out.println("tiless  "+total_tile);
    }
}
