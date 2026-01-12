 import java.util.Scanner;

 class Q20 {
public static void main(String[] args) {

Scanner sc = new Scanner (System.in);

System.out.println("length");
    int length = sc.nextInt();

    System.out.println("breadth");
    int breadth = sc.nextInt();

    System.out.println("height");
    int height = sc.nextInt();
    
    int volume = length*breadth*height;
    System.out.println("volume "+ volume );
}    
}
