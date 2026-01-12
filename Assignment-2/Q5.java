import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cost");
    float cost = sc.nextInt();

    System.out.println("rate");
    float rate = sc.nextInt();

    System.out.println("length");
    float length =sc.nextInt();
    
    float area; 
    float breadth;
    float perimeter;
    area = (cost/rate);
    breadth = (area/length);
    perimeter = 2*(length+breadth);
    System.out.println("area " + area);
    System.out.println("breadth " + breadth);
    System.out.println("perimeter " + perimeter);   

    }
    
}
