import java.util.Scanner;
class Q1{
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.println("enter a length");
    int length = sc.nextInt();

    System.out.println("enter a breadth");
    int breadth = sc.nextInt();

    if (length==breadth)
    System.out.println("yes this is square");
    else
    System.out.println("this is not a square");
}
}