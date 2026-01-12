import java.util.Scanner;
class Home {
    private String name;
    private int days;
    private double rentPerDay;

    Home(String name ,int days, double rentPerDay){
         this.days = days;
          this.rentPerDay = rentPerDay;
    }
    public double calculateTotal() {
        return days * rentPerDay;
    }
    public void showBill() {
        System.out.println("\n--- Home Rental Bill ---");
        System.out.println("Name       : "+name);
        System.out.println("Days       : " + days);
        System.out.println("Rate/Day   : " + rentPerDay);
        System.out.println("Total Rent : " + calculateTotal());
    }
}
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter number of days: ");
        int d = sc.nextInt();
        System.out.print("Enter rent per day: ");                                      
        double rate = sc.nextDouble();

        Home  obj = new Home(name, d, rate);
        obj.showBill();
    }
}                                                                                                   
