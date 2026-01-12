// 11) WAP to manage Child vaccination 
import java.util.Scanner;

class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Child Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        boolean polio = false, bcg = false, hepatitis = false, dtp = false;

        System.out.println("\nAvailable Vaccines:");
        System.out.println("1. Polio");
        System.out.println("2. BCG");
        System.out.println("3. Hepatitis");
        System.out.println("4. DTP");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            polio = true;
            System.out.println("Polio vaccine given!");
        } else if (choice == 2) {
            bcg = true;
            System.out.println("BCG vaccine given!");
        } else if (choice == 3) {
            hepatitis = true;
            System.out.println("Hepatitis vaccine given!");
        } else if (choice == 4) {
            dtp = true;
            System.out.println("DTP vaccine given!");
        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("\n===== Child Vaccination Report =====");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);

        
        if (polio){
        } System.out.println("Polio");
            
        if (bcg) {
        }System.out.println("BCG");
            
        if (hepatitis){
         System.out.println("Hepatitis");
        }
            
        if (dtp) {
        System.out.println("DTP");

        }
        System.out.println("\nVaccines Completed:");
  }
}
