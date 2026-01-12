// Write a Java program to calculate profit or loss. 
import java.util.Scanner;
class Q40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Cost price");
        int CP = sc.nextInt();
        System.out.println("enter a selling price");
        int SP = sc.nextInt();
        
        int result = SP-CP;
        if(result > 0){
            System.out.println("You will get profit of "+ result+" Rs");
        }else{
            System.out.println("You will get loss of "+ result+" Rs");
        }

}
}