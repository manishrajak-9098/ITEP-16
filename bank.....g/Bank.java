
import java.util.Scanner;
class Account{
    int acNo;
    String acHolderName;
    Account(int acNo, String acHolderName){
        this.acNo = acNo;
        this.acHolderName= acHolderName;

    }
   int getaccount(){
        return acNo;
    }
  String  getaccountNa(){
        return acHolderName;
    }
}
class Balance extends Account{
    double balance;
    Balance(int acNo , String acHolderName, double balance){
        super(acNo, acHolderName);
        this.balance = balance;

    }
   double getbalance(){
        return balance;
    }
}
class Transaction extends Balance{
    double wAmt;
    double dAmt;
    Transaction(int acNo, String acHolderName, double balance, double wAmt, double dAmt){
        super(acNo, acHolderName, balance);
        this.wAmt = wAmt;
        this.dAmt = dAmt;

    }
   double getdeposit(){
        return balance+dAmt;
    }
   double  getwithdrawl(){
        return getdeposit()-wAmt;
    }
}

class Bank{
    public static void main (String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter Account no..:");
        int actNo = sc.nextInt();
        sc.nextLine();

        System.out.println("enter Account Holdeer name..:");
        String acHolderName = sc.nextLine();

        System.out.println("enter  a initial balance ..:");
        double balance = sc.nextDouble();

        System.out.println("enter  a deposit   amount ..:");
        double dAmt = sc.nextDouble();

        System.out.println("enter  a withdrawl  amount ..:");
        double wAmt =sc.nextDouble();

        Transaction tobj = new Transaction(actNo, acHolderName, balance, wAmt, dAmt);
        System.out.println("account no:"+tobj.getaccount());
        System.out.println("account HOLDER name:"+tobj.getaccountNa());
        System.out.println("account balance:"+tobj.getbalance());
        System.out.println("account deposit balance :"+tobj.getdeposit());
        System.out.println("account withrwal balance: "+tobj.getwithdrawl());  
        
    }
}
