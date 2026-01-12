import java.util.Scanner;
class Q3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
         
         double bonus = 0.05;

         System.out.println("ask for salary");
         double salary = sc.nextDouble();

         System.out.println("service of year");
         double year = sc.nextDouble(); 

          

         if(year>5){
              double net_bonus = (salary*bonus);
            System.out.println("you gave a bonus..." + net_bonus);
         }
         else{
            System.out.println(" you not complete 5 year");
         }
    }
}