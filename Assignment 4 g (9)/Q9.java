import java.util.Scanner;

class Q9 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(CYAN + "======= CREATE YOUR ACCOUNT =======" + RESET);
        System.out.print("ENTER YOUR MAIL-ID : ");
        String mailid = sc.nextLine();
        System.out.print("ENTER YOUR PASSWORD : ");
        String password = sc.nextLine();
        System.out.print("ENTER YOUR FULL NAME : ");
        String name = sc.nextLine();
        System.out.print("ENTER YOUR AGE : ");
        int age = sc.nextInt();

        int balance = 0;
        int accountType = 0;
        sc.nextLine();

        System.out.println(YELLOW + "\nChoose Account Type:" + RESET);
        System.out.println("1. Joint Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Child Account");
        accountType = sc.nextInt();

        if (accountType == 1) {
            sc.nextLine();
            System.out.print("Enter spouse name: ");
            String spouseName = sc.nextLine();
            System.out.print("Enter spouse age: ");
            int spouseAge = sc.nextInt();
            balance = 5000;
            System.out.println(GREEN + "Joint Account created with minimum deposit Rs. 5000" + RESET);
        } else if (accountType == 2) {
            sc.nextLine();
            System.out.print("Enter nominee name: ");
            String nominee = sc.nextLine();
            System.out.print("Enter nominee age: ");
            int nomineeAge = sc.nextInt();
            balance = 2000;
            System.out.println(GREEN + "Saving Account created with minimum deposit Rs. 2000" + RESET);
        } else if (accountType == 3) {
            sc.nextLine();
            System.out.print("Enter child name: ");
            String childName = sc.nextLine();
            System.out.print("Enter guardian age: ");
            int guardianAge = sc.nextInt();
            balance = 1000;
            System.out.println(GREEN + "Child Account created with minimum deposit Rs. 1000" + RESET);
        } else {
            System.out.println(RED + "Invalid choice! Account not created." + RESET);
            return;
        }

        boolean active = true;
        while (active) {
            System.out.println(BLUE + "\n====== MENU ======" + RESET);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            System.out.println("4. Deactivate Account");
            System.out.print("Choose option: ");
            int op = sc.nextInt();
            System.out.print("ENTER PASSWORD : ");
            sc.nextLine(); 
            String ps = sc.nextLine();
            if (!ps.equals(password)) {
                System.out.println(RED + "WRONG PASSWORD!" + RESET);
                continue;
            }
            switch (op) {
                case 1:
                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
                    int dep = sc.nextInt();
                    balance += dep;
                    System.out.println(GREEN + "Deposit Successful! Current Balance: Rs." + balance + RESET);
                    break;
                case 2:
                    System.out.print("ENTER AMOUNT TO WITHDRAW: ");
                    int wd = sc.nextInt();
                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println(GREEN + "Withdrawal Successful! Current Balance: Rs." + balance + RESET);
                    } else {
                        System.out.println(RED + "Insufficient Balance!" + RESET);
                    }
                    break;
                case 3:
                    System.out.println(CYAN + "\n======= YOUR DETAILS =========" + RESET);
                    System.out.println("NAME      : " + name);
                    System.out.println("AGE       : " + age);
                    System.out.println("MAIL-ID   : " + mailid);
                    System.out.println("BALANCE   : Rs." + balance);
                    System.out.println("ACCOUNT   : " + 
                        (accountType==1?"Joint Account":accountType==2?"Saving Account":"Child Account"));
                    break;
                case 4:
                    System.out.println(RED + "Account Deactivated. Thank you!" + RESET);
                    active = false;
                    break;
                default:
                    System.out.println(RED + "Invalid Option!" + RESET);
            }
    }
  }
}
