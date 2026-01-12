import java.util.Scanner;
class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("perimeter");
        int perimeter = sc.nextInt();

        System.out.println("lenght ");
        int length = sc.nextInt();
         
         
        int breadth = (perimeter - 2*length)/2;
        int area = (length*breadth);
        
         System.out.println("breadth  " +breadth);
        
         System.out.println("area  " +area);

    
    }
}