 import java.util.Scanner;
 class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("height");
        float height = sc.nextFloat();

        System.out.println("base");
        float base = sc.nextFloat();

        float area;
        area = base*height/2;
        System.out.println("area "+ area); 
    }
    
}
