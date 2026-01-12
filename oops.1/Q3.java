// Bank Account
// Create a class BankAccount with fields: accountNumber, holderName, balance.
// Use setters to assign values. Add a method to display balance.

class BankAccount{
   private  String accountNumber;
   private String holderName;
   private  float balance;

    public void setdata(String accountNumber, String holderName, float balance){
    this.accountNumber=accountNumber;
    this.holderName=holderName;
    this.balance=balance;

}

public void displaybalance(){
    System.out.println("Account number : "+this.accountNumber);
    System.out.println("Holder Name : "+this.holderName);
    System.out.println("Balance : "+this.balance);
}

}

class Q3{
    public static void main (String args[]){
        BankAccount ba = new BankAccount();
        ba.setdata("640000545454", "manish ", 5000000f);
        ba.displaybalance();
    }
}