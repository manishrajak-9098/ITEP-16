 System.out.println(Account.ANSI_BOLD_MAGENTA + "--- Joint Account Setup ---" + Account.ANSI_RESET);
                while (true) {
                    System.out.print(Account.ANSI_CYAN + "Enter your spouse name: " + Account.ANSI_RESET);
                    account.sname = sc.nextLine();
                    if (account.sname.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println(Account.ANSI_RED + "Invalid input! Name should contain only alphabets and not be empty. Try again." + Account.ANSI_RESET);
                    }
                }