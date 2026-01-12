import java.util.Scanner;
class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println(" volume");
        int volume = sc.nextInt();

         System.out.println("radius");
        int radius = sc.nextInt();

        
        float height = volume/(3.14f*radius*radius);
        float surface_area = 2*3.14f*10*(height+radius);
        System.out.println("area  "+ surface_area);

    }
    
}
