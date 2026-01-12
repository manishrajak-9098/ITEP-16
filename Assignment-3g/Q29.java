// 29. Write a program to calculate gross salary and net salary. Accept basic salary from user,
// TA(Travel Allowance) i.e 10% of basic salary, PF(Provident Fund) i.e 7.8% of basic 
// , DA(Dearness Allowance) is 500, gs=basic+da+ta; ns=gs-pf;
import java.util.Scanner;
class salary{
    private int basicsalary;
    private double gs;
    private double ns;
    private double providentFund;
    private int DearnrssAllowence;
    private double TravelAllowence;

void set(int basicsalary){
     this.basicsalary = basicsalary;
   }

 public void grosssalary(){
       TravelAllowence = basicsalary * 0.10; 
       DearnrssAllowence = 500;
       providentFund = basicsalary * (7.8/100);

      gs = basicsalary + DearnrssAllowence + TravelAllowence;
      System.out.println("Basic Salary : "+this.basicsalary);
      System.out.println(" gross salary : "+gs);

    }
public double Netsalary(){

      ns = gs-providentFund;
      return ns;
      }
    } 

class Q29{
      public static void main (String args[]){
      Scanner sc = new Scanner (System.in);
      salary s = new salary();

    System.out.println("Enter a basic Salary : ");
    int basicsalary = sc.nextInt();

    s.set(basicsalary);
    s.grosssalary();
    System.out.println("Net salary : "+s.Netsalary());
     
    }
}
