import java.util.Scanner;
  class Q15{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the cost of bike(in Rs)");
      float cost = sc.nextFloat();

      if(cost>100000){
        System.out.println("tax will be 15%");

      }else if(cost>50000 && cost<=100000){
        System.out.println("tax will be 10%");

      }else if(cost<=50000){
        System.out.println("tax will be 5%");
               }
            }
         }