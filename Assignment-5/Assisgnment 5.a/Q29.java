// //29) 1	11	111	1111	  11111	……

//  import java.util.Scanner;
//  class Q29{
//     public static void main (String args[]){

//     Scanner sc = new Scanner (System.in);
//     System.out.println("Enter n");
//     int n = sc.nextInt();

//     int i=0;
//     for(i=0;n!=0;n--){
//         i = i*10+1;
//         System.out.print(i+" ");

//        }
//     }
//  }

// 29) 1	11	111	1111	  11111	……
import java.util.Scanner;
class Q29{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int i = 1;
    int term = 1;
    int multiply = 1;

    for(i=1; i<=num; i++){
        System.out.print(term+ " ");
        multiply = multiply *10;
        term = term + multiply;
   
}
}
}