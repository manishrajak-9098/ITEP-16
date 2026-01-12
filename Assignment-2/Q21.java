import java.util.Scanner;
 class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("l");
        int l = sc.nextInt();

        System.out.println("b");
        int b = sc.nextInt();

        System.out.println("h");
        int h = sc.nextInt();

        System.out.println("length");
        int length = sc.nextInt();

        System.out.println("breadth");
        int breadth = sc.nextInt();

        System.out.println("height");
        int height = sc.nextInt();

        
        int volume_w = length*breadth*height;
       int volume_b = l*b*h;
        int number = (volume_w/volume_b);
System.out.println("volume_w " + volume_w);
System.out.println("volume b  "+ volume_b);
System.out.println("no. "+ number);


    }
    
}
