//Gamil
import java.util.Scanner;
class Q2{
    public static void main(String[] arga){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your email id");
    String id = sc.nextLine();
    while(true){
    if(id.matches("^[A-Za-z0-9._-]+@gmail\\.com$")){
        System.out.println(" Email : "+id);
        break;
    }
    else
    System.out.println("Invalid input");
    System.out.println("Enter your email id Again");
     id = sc.nextLine();
}
}
}