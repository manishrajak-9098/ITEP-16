import java.util.Scanner;
class Q24{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter  number");
      int num = sc.nextInt();

      if(num>0)       
      System.out.println("+ve");
    
      else if(num<0)
      System.out.println("-ve");

      else
      System.out.println("neither +ve nor -ve");
    }
    }
