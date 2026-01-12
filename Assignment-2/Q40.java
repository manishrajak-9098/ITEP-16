import java.util.Scanner;
class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("radius");
        int radius = sc.nextInt();

        System.out.println("height");
        int height = sc.nextInt();


        float volume_of_cylinder = 3.14f*radius*radius*height;
        System.out.println("volume of cylinder  "+volume_of_cylinder);
    }
    
}
