// 16.Create a class TCSEmployee with data members name, eid, salary and companyName to store information of
//  All TCS’s Employee records. Create functions which accept these members value and display them.
//   Now u need to manage that companyName should be assign only once, no matter how
// many number of object of this class created.
import java.util.Scanner;
class TCSEmployee{
    String name;
    int eId;
    double amount ;
   static String  companyName = "TCS";


TCSEmployee(String name, int eId, double amount){
    this.name = name;
    this.eId = eId;
    this.amount = amount;

}
void display(){
    System.out.println( name +"\t\t"+eId+"\t\t"+amount+"\t\t"+ companyName);

   }
}
 class Q16{
    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter no of Employee");
        int n = sc.nextInt();

       
        TCSEmployee[] arr = new TCSEmployee[n];

        for(int i = 0; i<n; i++){
        System.out.println("\nEnter "+(i+1)+" Employee details:- ");
        sc.nextLine();
        System.out.println("Enter  name ");
        String name = sc.nextLine();

        System.out.println("Enter eId no");
        int eId = sc.nextInt();

        System.out.println("Enter  Amount ");
        int amount = sc.nextInt();

            arr[i] = new TCSEmployee(name, eId, amount);
        }

        System.out.println();    
        System.out.println("Name\t\tE id\t\t Amount \t\t CompanyName");    
         for(TCSEmployee te : arr){
        te.display();
        }

    }
 }
