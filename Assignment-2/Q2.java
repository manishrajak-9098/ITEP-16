import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area..");
        int area = sc.nextInt();

        System.out.println("breadth.");
        int breadth = sc.nextInt();
        

       int length = (area/breadth);
       int perimeter = 2*(length + breadth );
       
        System.out.println("length " + length);
        System.out.println("perimeter " + perimeter);
        
    }
    
}

