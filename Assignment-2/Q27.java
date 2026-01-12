import java.util.Scanner;
class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println(" length");
    int l = sc.nextInt();

    System.out.println("width");
    int w = sc.nextInt();

    System.out.println("rate");
    int rate = sc.nextInt();

    
    int area = l*w;
    int cost = area*rate;
    System.out.println("cost  " + cost);

    }
    
}
