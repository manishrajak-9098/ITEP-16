class Q29 {
    public static void main(String[] args) {
        int l = 800;
        int b = 900;
        int side = 10;
        int area_of_floor = l*b;
        int area_of_tile = side*side;
        int no_of_tile = area_of_floor/area_of_tile;
        System.out.println("tiless  " +no_of_tile);
    }
    
}
