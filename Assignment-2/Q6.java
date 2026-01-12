import java.util.Scanner;
 class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a");
    double a = sc.nextInt();

    System.out.println("b");
    double b = sc.nextInt();

    System.out.println("perimeter");
    double perimeter = sc.nextInt();

    
    double c;
    double area;
    double s;
 
    c =(perimeter-a-b);
     s = (a+b+c)/2; 
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("side c " + c);
    System.out.println("side " +s);
    System.out.println("area " +area);
     
    }
    
}
