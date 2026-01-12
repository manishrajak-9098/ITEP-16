import java.util.Scanner;
  class Q17{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length");
      double length = sc.nextDouble();

       System.out.println("Enter the breadth");
      double breadth = sc.nextDouble();

      double area = length*breadth;
      System.out.println("area.:"+area);
}
}