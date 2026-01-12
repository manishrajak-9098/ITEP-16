import java.util.Scanner;
class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("length");
        int l = sc.nextInt();

        System.out.println("width");
        int w = sc.nextInt();

        System.out.println("rate");
        int rate = sc.nextInt();


        int area = l*w;
        int price = area*rate;
        System.out.println("price "+price);
    }
    
}
