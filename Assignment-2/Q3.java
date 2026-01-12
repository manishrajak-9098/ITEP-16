import java.util.Scanner;
class Q3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("l_of_tile");
 int l_of_tile=sc.nextInt();

 System.out.println("b_of_tile");
    int b_of_tile=sc.nextInt();

    System.out.println("l_of_reason");
    int l_of_reason=sc.nextInt();

    System.out.println("b_of_reason");
    int b_of_reason=sc.nextInt();
    
    int aera_of_reason, aera_of_one_tile;
     aera_of_one_tile=l_of_tile*b_of_tile;
     aera_of_reason=l_of_reason*b_of_reason;
    int total_tile=aera_of_reason/aera_of_one_tile;
    System.out.println("total_tile "+total_tile);
}
}
