import java.util.Scanner;
  class Q22{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st number");
      int num1 = sc.nextInt();

      System.out.println("Enter 2nd number");
      int num2 = sc.nextInt();

        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();

      if(num1>num2 && num1>num3){
        System.out.println("1st number is greater than 2nd $ 3rd");
      }
     else if(num2>num1 && num2>num3){
       System.out.println("2nd number is greater then 1st and 3rd");
     }
       else {
        System.out.println("3rd no. is greater.");
     }
}
}
