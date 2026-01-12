import java.util.Scanner;

class Q2{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        float cost = 100;
        float dis = 0.1f;

        System.out.println("quantity");
        float quantity = sc.nextFloat();

    
        
        float total_cost = (quantity*cost);
         System.out.println("total cost  "+total_cost);

        if(total_cost>1000){
        System.out.println("you have a 10 percent dis......"+total_cost*dis);
        }
        else{
        System.out.println("visit next time");

        }
    
    }

}