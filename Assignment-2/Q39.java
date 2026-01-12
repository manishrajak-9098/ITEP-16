import java.util.Scanner;
class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("radius");
        int r = sc.nextInt();

        System.out.println("height");
        int h = sc.nextInt();
        
        float surface_area = 2*3.14f*r*(h+r); 
        System.out.println("surface area "+ surface_area);
    }
    
}
