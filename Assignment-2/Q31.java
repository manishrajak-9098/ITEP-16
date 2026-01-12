import java.util.Scanner;
class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("perimeter");
        int perimeter = sc.nextInt();
        int side = perimeter/4;
        int area = side*side;
        System.out.println("total area  "+area);
    }
    
}
