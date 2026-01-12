import java.util.Scanner;
class Q41{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("height");
        int h = sc.nextInt();

         System.out.println("radius");
        int r = sc.nextInt();

        float volume = 3.14f*r*r*h;
        System.out.println("volume "+volume);
    }

}