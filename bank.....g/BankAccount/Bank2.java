import java.util.Scanner;
import java.io.Console;

class Account {
    // ANSI color codes as static final fields for easy access
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Bold versions for emphasis
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_BOLD_RED = "\u001B[1;31m";
    public static final String ANSI_BOLD_GREEN = "\u001B[1;32m";
    public static final String ANSI_BOLD_YELLOW = "\u001B[1;33m";
    public static final String ANSI_BOLD_BLUE = "\u001B[1;34m";
    public static final String ANSI_BOLD_MAGENTA = "\u001B[1;35m";
    public static final String ANSI_BOLD_CYAN = "\u001B[1;36m";

    String name;
    int age;
    private String pass;

    String sname; // Spouse name for Joint Account
    int sage;     // Spouse age for Joint Account
    int jamt;     // Joint Account amount

    String nname; // Nominee name for Saving Account
    int nage;     // Nominee age for Saving Account
    int namt;     // Saving Account amount

    String cname; // Child name for Child Account
    int cage;     // Guardian age for Child Account (as per main method's prompt)
    int camt;     // Child Account amount

    Account(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    // Methods now accept Scanner and Console as arguments
    void deposit(Scanner sc, Console console) {
        if (console == null) {
            System.out.println(ANSI_RED + "Error: No console available for secure password input. Cannot deposit." + ANSI_RESET);
            return;
        }
        char[] passwordArray = console.readPassword(ANSI_CYAN + "Enter your password: " + ANSI_RESET);
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            int amt;
            while (true) {
                System.out.print(ANSI_CYAN + "Enter amount to deposit: " + ANSI_RESET);
                if (sc.hasNextInt()) {
                    amt = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (amt > 0) { // Basic validation for deposit amount
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Deposit amount must be positive. Please enter deposit amount again." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                    }
                } else {
                    System.out.println(ANSI_RED + "Invalid input! Please enter a number. Please enter deposit amount again." + ANSI_RESET);
                    sc.nextLine(); // Consume invalid line
                    System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                }
            }

            System.out.println(ANSI_YELLOW + "Deposit for which account: " + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1. Joint Account" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2. Saving Account" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "3. Child Account" + ANSI_RESET);
            
            int choice;
            while (true) {
                System.out.print(ANSI_CYAN + "Enter your choice(1-3): " + ANSI_RESET);
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (choice >= 1 && choice <= 3) {
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Invalid choice! Please enter a number between 1 and 3. Please enter your choice again." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                    }
                } else {
                    System.out.println(ANSI_RED + "Invalid input! Please enter a number. Please enter your choice again." + ANSI_RESET);
                    sc.nextLine(); // Consume invalid line
                    System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                }
            }

            switch (choice) {
                case 1:
                    jamt += amt;
                    System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " successfully deposited in Joint account." + ANSI_RESET);
                    break;
                case 2:
                    namt += amt;
                    System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " successfully deposited in Saving account." + ANSI_RESET);
                    break;
                case 3:
                    camt += amt;
                    System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " successfully deposited in Child account." + ANSI_RESET);
                    break;
            }
        } else {
            System.out.println(ANSI_BOLD_RED + "Incorrect password!" + ANSI_RESET);
        }
    }

    void withdraw(Scanner sc, Console console) {
        if (console == null) {
            System.out.println(ANSI_RED + "Error: No console available for secure password input. Cannot withdraw." + ANSI_RESET);
            return;
        }
        char[] passwordArray = console.readPassword(ANSI_CYAN + "Enter your password: " + ANSI_RESET);
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            int amt;
            while (true) {
                System.out.print(ANSI_CYAN + "Enter amount to withdraw: " + ANSI_RESET);
                if (sc.hasNextInt()) {
                    amt = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (amt > 0) { // Basic validation for withdraw amount
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Withdraw amount must be positive. Please enter withdraw amount again." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                    }
                } else {
                    System.out.println(ANSI_RED + "Invalid input! Please enter a number. Please enter withdraw amount again." + ANSI_RESET);
                    sc.nextLine(); // Consume invalid line
                    System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                }
            }

            System.out.println(ANSI_YELLOW + "Withdraw from which account: " + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1. Joint Account" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2. Saving Account" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "3. Child Account" + ANSI_RESET);
            
            int choice;
            while (true) {
                System.out.print(ANSI_CYAN + "Enter your choice(1-3): " + ANSI_RESET);
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (choice >= 1 && choice <= 3) {
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Invalid choice! Please enter a number between 1 and 3. Please enter your choice again." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                    }
                } else {
                    System.out.println(ANSI_RED + "Invalid input! Please enter a number. Please enter your choice again." + ANSI_RESET);
                    sc.nextLine(); // Consume invalid line
                    System.out.println(ANSI_YELLOW + "--------------------------------------" + ANSI_RESET); // Added for clarity
                }
            }

            switch (choice) {
                case 1:
                    if (amt <= jamt) {
                        jamt -= amt;
                        System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " withdrawn from Joint account." + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_BOLD_RED + "Insufficient balance in Joint account!" + ANSI_RESET);
                    }
                    break;
                case 2:
                    if (amt <= namt) {
                        namt -= amt;
                        System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " withdrawn from Saving account." + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_BOLD_RED + "Insufficient balance in Saving account!" + ANSI_RESET);
                    }
                    break;
                case 3:
                    if (amt <= camt) {
                        camt -= amt;
                        System.out.println(ANSI_BOLD_GREEN + "Amount " + amt + " withdrawn from Child account." + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_BOLD_RED + "Insufficient balance in Child account!" + ANSI_RESET);
                    }
                    break;
            }
        } else {
            System.out.println(ANSI_BOLD_RED + "Incorrect password!" + ANSI_RESET);
        }
    }

    void display(Console console) {
        if (console == null) {
            System.out.println(ANSI_RED + "Error: No console available for secure password input. Cannot display details." + ANSI_RESET);
            return;
        }
        char[] passwordArray = console.readPassword(ANSI_CYAN + "Enter your password to view details: " + ANSI_RESET);
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            System.out.println(ANSI_BOLD_MAGENTA + "\n--- Account Details ---" + ANSI_RESET);
            // Using printf with %-Xs for aligned output
            System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%s%n" + ANSI_RESET, "Main Account Holder:", name);
            System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%d%n" + ANSI_RESET, "Age:", age);

            // Display details only if the respective account type was opened (based on name presence)
            if (sname != null && !sname.isEmpty()) {
                System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%s%n" + ANSI_RESET, "Spouse Name:", sname);
                System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%d%n" + ANSI_RESET, "Spouse Age:", sage);
            }
            if (nname != null && !nname.isEmpty()) {
                System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%s%n" + ANSI_RESET, "Nominee Name:", nname);
                System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%d%n" + ANSI_RESET, "Nominee Age:", nage);
            }
            if (cname != null && !cname.isEmpty()) {
                 System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%s%n" + ANSI_RESET, "Child Name:", cname);
                 System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_GREEN + "%d%n" + ANSI_RESET, "Guardian Age:", cage);
            }

            // Display balances (use blue for amounts for distinction)
            System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_BLUE + "₹%d%n" + ANSI_RESET, "Joint Account Balance:", jamt);
            System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_BLUE + "₹%d%n" + ANSI_RESET, "Saving Account Balance:", namt);
            System.out.printf(ANSI_YELLOW + "%-25s" + ANSI_BLUE + "₹%d%n" + ANSI_RESET, "Child Account Balance:", camt);
            System.out.println(ANSI_BOLD_MAGENTA + "-----------------------" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BOLD_RED + "Incorrect password!" + ANSI_RESET);
        }
    }

    void deactivate(Console console) {
        if (console == null) {
            System.out.println(ANSI_RED + "Error: No console available for secure password input. Cannot deactivate." + ANSI_RESET);
            return;
        }
        char[] passwordArray = console.readPassword(ANSI_CYAN + "Enter your password to deactivate accounts: " + ANSI_RESET);
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            jamt = namt = camt = 0;
            System.out.println(ANSI_BOLD_GREEN + "All accounts deactivated successfully. Balances set to 0." + ANSI_RESET);
        } else {
            System.out.println(ANSI_BOLD_RED + "Incorrect password! Accounts not deactivated." + ANSI_RESET);
        }
    }
}

class Bank2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        // Check for console availability early
        if (console == null) {
            System.err.println(Account.ANSI_RED + "Error: No console available. This application requires an interactive console for secure password input. Please run from a terminal." + Account.ANSI_RESET);
            System.exit(1); // Exit if console is not available
        }

        String name;
        int age;
        String gmail;

        System.out.println(Account.ANSI_BOLD_BLUE + "\n========== Welcome to State Bank Of India ==========" + Account.ANSI_RESET);
        System.out.println(Account.ANSI_YELLOW + "Note: For password input, backspace and editing keys may not work due to security features of secure console input." + Account.ANSI_RESET);


        while (true) {
            System.out.print(Account.ANSI_CYAN + "Enter your name: " + Account.ANSI_RESET);
            name = sc.nextLine();
            // --- COMMENT: Name validation check. Regex now allows alphabets, spaces, dots, hyphens, and apostrophes. ---
            // --- COMMENT: '!name.trim().isEmpty()' ensures the input is not just spaces or empty. ---
            if (name.matches("[a-zA-Z .'-]+") && !name.trim().isEmpty()) {
                break; // Valid name, exit loop.
            } else {
                System.out.println(Account.ANSI_RED + "Invalid input! Name should contain only alphabets, spaces, dots, hyphens, or apostrophes, and not be empty. Please enter your name again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                // Loop continues, re-prompting for the name.
            }
        }

        while (true) {
            System.out.print(Account.ANSI_CYAN + "Enter your age: " + Account.ANSI_RESET);
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine(); // --- COMMENT: Consumes the newline character left by nextInt() to prevent subsequent nextLine() from skipping. ---
                if (age >= 18 && age < 120) {
                    break; // Valid age, exit loop.
                } else {
                    System.out.println(Account.ANSI_RED + "Invalid age! Age must be 18 or greater and less than 120. Please enter your age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                    System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    // Loop continues, re-prompting for the age.
                }
            } else {
                System.out.println(Account.ANSI_RED + "Invalid input! Please enter numbers only for age. Please enter your age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                sc.nextLine(); // --- COMMENT: Consumes the entire invalid line from the input buffer. ---
                System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                // Loop continues, re-prompting for the age.
            }
        }

        while (true) {
            System.out.print(Account.ANSI_CYAN + "Enter your Gmail address: " + Account.ANSI_RESET);
            gmail = sc.nextLine();
            // --- COMMENT: Gmail format validation check. ---
            if (gmail.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
                break; // Valid Gmail, exit loop.
            } else {
                System.out.println(Account.ANSI_RED + "Invalid Gmail! Please enter a valid Gmail address (e.g., example@gmail.com). Please enter your Gmail address again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                // Loop continues, re-prompting for Gmail.
            }
        }

        char[] passwordArray = console.readPassword(Account.ANSI_CYAN + "Create your password: " + Account.ANSI_RESET);
        String pass = new String(passwordArray);
        System.out.println(Account.ANSI_BOLD_GREEN + "Account password set successfully!" + Account.ANSI_RESET);

        Account account = new Account(name, age, pass);

        System.out.println(Account.ANSI_YELLOW + "\nAccount opening options:- " + Account.ANSI_RESET);
        String accType[] = { "Joint Account", "Saving Account", "Child Account" };
        for (int i = 0; i < 3; i++) {
            System.out.println(Account.ANSI_GREEN + (i + 1) + ". " + accType[i] + Account.ANSI_RESET);
        }

        int n; // Choice for account type to open
        while(true) {
            System.out.print(Account.ANSI_CYAN + "Enter your choice for the account type to open (1-3): " + Account.ANSI_RESET);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine(); // --- COMMENT: Consumes the newline character left by nextInt() after reading account type choice. ---
                if (n >= 1 && n <= 3) {
                    break; // Valid choice, exit loop.
                } else {
                    System.out.println(Account.ANSI_RED + "Invalid choice! Please enter a number between 1 and 3. Please enter your choice again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                    System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    // Loop continues, re-prompting for account type choice.
                }
            } else {
                System.out.println(Account.ANSI_RED + "Invalid input! Please enter a number (1-3). Please enter your choice again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                sc.nextLine(); // --- COMMENT: Consumes the entire invalid line. ---
                System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                // Loop continues, re-prompting for account type choice.
            }
        }
    
        account.jamt = 0; // Initialize balances to 0 before potential deposit
        account.namt = 0;
        account.camt = 0;

        switch (n) {
            case 1:
                System.out.println(Account.ANSI_BOLD_MAGENTA + "--- Joint Account Setup ---" + Account.ANSI_RESET);
                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter your spouse name: " + Account.ANSI_RESET);
                    account.sname = sc.nextLine();
                    // --- COMMENT: Spouse name validation. Same regex as main account holder. ---
                    if (account.sname.matches("[a-zA-Z .'-]+") && !account.sname.trim().isEmpty()) {
                        break; // Valid name, exit loop.
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Name should contain only alphabets, spaces, dots, hyphens, or apostrophes, and not be empty. Please enter spouse's name again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                        // Loop continues, re-prompting for spouse name.
                    }
                }

                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter your spouse age: " + Account.ANSI_RESET);
                    if (sc.hasNextInt()) {
                        account.sage = sc.nextInt();
                        sc.nextLine(); // --- COMMENT: Consumes the newline character after spouse age input. ---
                        if (account.sage >= 18 && account.sage < 120) {
                            break; // Valid age, exit loop.
                        } else {
                            System.out.println(Account.ANSI_RED + "Invalid age! Spouse age must be 18 or greater and less than 120. Please enter spouse's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                            System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                            // Loop continues, re-prompting for spouse age.
                        }
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Please enter numbers only for age. Please enter spouse's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        sc.nextLine(); // --- COMMENT: Consumes the entire invalid line. ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                        // Loop continues, re-prompting for spouse age.
                    }
                }
                account.jamt = 5000;
                System.out.println(Account.ANSI_BOLD_GREEN + "Joint Account opened successfully with an initial deposit of ₹5000." + Account.ANSI_RESET);
                break;

            case 2:
                System.out.println(Account.ANSI_BOLD_MAGENTA + "--- Saving Account Setup ---" + Account.ANSI_RESET);
                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter your nominee name: " + Account.ANSI_RESET);
                    account.nname = sc.nextLine();
                    // --- COMMENT: Nominee name validation. ---
                    if (account.nname.matches("[a-zA-Z .'-]+") && !account.nname.trim().isEmpty()) {
                        break;
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Name should contain only alphabets, spaces, dots, hyphens, or apostrophes, and not be empty. Please enter nominee's name again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    }
                }

                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter your nominee age: " + Account.ANSI_RESET);
                    if (sc.hasNextInt()) {
                        account.nage = sc.nextInt();
                        sc.nextLine(); // --- COMMENT: Consumes the newline character after nominee age input. ---
                        if (account.nage > 0 && account.nage < 120) { // Nominee can be a child, so > 0
                            break;
                        } else {
                            System.out.println(Account.ANSI_RED + "Invalid age! Nominee age must be greater than 0 and less than 120. Please enter nominee's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                            System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                        }
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Please enter numbers only for age. Please enter nominee's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        sc.nextLine(); // --- COMMENT: Consumes the entire invalid line. ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    }
                }
                account.namt = 2000;
                System.out.println(Account.ANSI_BOLD_GREEN + "Saving Account opened successfully with an initial deposit of ₹2000." + Account.ANSI_RESET);
                break;

            case 3:
                System.out.println(Account.ANSI_BOLD_MAGENTA + "--- Child Account Setup ---" + Account.ANSI_RESET);
                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter child name: " + Account.ANSI_RESET);
                    account.cname = sc.nextLine();
                    // --- COMMENT: Child name validation. ---
                    if (account.cname.matches("[a-zA-Z .'-]+") && !account.cname.trim().isEmpty()) {
                        break;
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Name should contain only alphabets, spaces, dots, hyphens, or apostrophes, and not be empty. Please enter child's name again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    }
                }

                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter age of parent/guardian: " + Account.ANSI_RESET);
                    if (sc.hasNextInt()) {
                        account.cage = sc.nextInt();
                        sc.nextLine(); // --- COMMENT: Consumes the newline character after guardian age input. ---
                        if (account.cage >= 18 && account.cage < 120) {
                            break;
                        } else {
                            System.out.println(Account.ANSI_RED + "Invalid age! Parent/guardian age must be 18 or greater and less than 120. Please enter parent/guardian's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                            System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                        }
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Please enter numbers only for age. Please enter parent/guardian's age again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        sc.nextLine(); // --- COMMENT: Consumes the entire invalid line. ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    }
                }
                account.camt = 1000;
                System.out.println(Account.ANSI_BOLD_GREEN + "Child Account opened successfully with an initial deposit of ₹1000." +Account.ANSI_RESET);
                break;
        }

        while (true) {
            System.out.println();
            System.out.println(Account.ANSI_BOLD_YELLOW + "----------- Main Menu -----------" + Account.ANSI_RESET);
            System.out.println(Account.ANSI_CYAN + "1. Deposit " + Account.ANSI_RESET);
            System.out.println(Account.ANSI_CYAN + "2. Withdraw " + Account.ANSI_RESET);
            System.out.println(Account.ANSI_CYAN + "3. Display Account Details " + Account.ANSI_RESET);
            System.out.println(Account.ANSI_CYAN + "4. Deactivate All Accounts " + Account.ANSI_RESET);
            System.out.println(Account.ANSI_CYAN + "5. Exit " + Account.ANSI_RESET);
            
            int choice;
            while (true) {
                System.out.print(Account.ANSI_CYAN + "Enter your choice (1-5): " + Account.ANSI_RESET);
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    sc.nextLine(); // --- COMMENT: Consumes the newline character after menu choice. ---
                    if (choice >= 1 && choice <= 5) {
                        break;
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid Input! Please enter a choice between 1 and 5. Please enter your choice again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                        System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                    }
                } else {
                    System.out.println(Account.ANSI_RED + "Invalid input! Please enter a number (1-5). Please enter your choice again." + Account.ANSI_RESET); // --- CHANGE: More specific error message ---
                    sc.nextLine(); // --- COMMENT: Consumes the entire invalid input line. ---
                    System.out.println(Account.ANSI_YELLOW + "--------------------------------------" + Account.ANSI_RESET); // Added separator for clarity
                }
            }
            
            switch (choice) {
                case 1:
                    System.out.println();
                    account.deposit(sc, console); // Pass scanner and console
                    break;
                case 2:
                    System.out.println();
                    account.withdraw(sc, console); // Pass scanner and console
                    break;
                case 3:
                    System.out.println();
                    account.display(console); // Pass console
                    break;
                case 4:
                    System.out.println();
                    account.deactivate(console); // Pass console and added password check
                    break;
                case 5:
                    System.out.println();
                    System.out.println(Account.ANSI_BOLD_BLUE + "Exiting program. Thank you for banking with State Bank of India!" + Account.ANSI_RESET);
                    sc.close(); // Close the main scanner
                    return;
            }
        }
    }
}