import java.util.Scanner;
 class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("length");
        float length = sc.nextInt();

        System.out.println("breadth");
        float breadth = sc.nextInt();

        System.out.println("round");
        float round = sc.nextInt();
        
        float perimeter;
        perimeter = 2*(length+breadth);
        float total_distance = (perimeter*round);
        System.out.println("perimeter " + perimeter);
        System.out.println("total dis. " + total_distance);
    }
    
}
