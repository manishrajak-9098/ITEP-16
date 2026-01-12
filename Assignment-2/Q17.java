import java.util.Scanner;
 class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("length");
    int length = sc.nextInt();

    System.out.println("breadth");
    int breadth = sc.nextInt();

    int perimeter;
    perimeter = 2*(length + breadth);
    System.out.println("perimeter " + perimeter);
    }
    
}
