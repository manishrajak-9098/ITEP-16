 import java.util.Scanner;
 class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("length");
        int length = sc.nextInt();

        System.out.println("width");
        int width = sc.nextInt();

        System.out.println("depth");
        int depth = sc.nextInt();
        
        int volume = length*width*depth;
        System.out.println("volume " + volume);
    }
    
}
