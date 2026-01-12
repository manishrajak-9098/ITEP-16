import java.util.Scanner;
class Q5{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

     
     System.out.println("age of Manish");
     double age1 = sc.nextDouble();

     System.out.println("age of hitesh");
     double age2 = sc.nextDouble();

     System.out.println("age of tanish");
     double age3 = sc.nextDouble();

     if (age1>age2 && age1>age3){
     System.out.println("1st is oldest.");
     }
     else if (age2>age1 && age2>age3){
        System.out.println("2nd is oldest");
     }

     else {System.out.println("3rd is oldest");
        }
        if (age1<age2 && age1<age3){
            System.out.println(" 1st is youngest");
        }
        else if (age2<age1 && age2<age3){
            System.out.println(" 2nd is youngest.");
        }
        else 
        {System.out.println("3rd is youngest.");

        }
    }
}