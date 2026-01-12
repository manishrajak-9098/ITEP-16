import java.util.Scanner;
class Q30{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle, Rate and Time: ");
        int p = sc.nextInt();   
        int r = sc.nextInt();   
        int t = sc.nextInt();   
        
        if(p >= 500){
        double amount = p * Math.pow((1 + r / 100f), t);
        double CI = amount - p;
        System.out.println("Compound Intrest is: "+CI);
        }
        else{
            int SI = (p * r * t) / 100;
        System.out.println("Simple Intrest is: "+SI);
     }
   }
}