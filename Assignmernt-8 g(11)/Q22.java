import java.util.Scanner;

class FourWheeler{
private char category;
private int amount;

FourWheeler(char c,int a){
this.category = c;
this.amount = a;
}

char getCategory(){
return category;
}
int getAmount(){
return amount;
}

}

class Car{
private String brand;
private String model;
private FourWheeler fw;

void getDetails(char c,int a,String b,String m){
this.brand = b;
this.model = m;
 FourWheeler fw = new FourWheeler(c,a);
}

void showDetails(){
System.out.println();
System.out.println("==========Car Details=========");
System.out.println("Brand    : "+brand);
System.out.println("Model    : "+model);
System.out.println("Category : "+fw.getCategory());
System.out.println("Amount   : "+fw.getAmount());
}

}

class Q22{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter brand: ");
String b = sc.nextLine();
System.out.print("Enter model: ");
String m = sc.nextLine();
System.out.print("Enter category(A|B|C): ");
char c = sc.next().charAt(0);
System.out.print("Enter amount: ");
int a = sc.nextInt();
sc.nextLine();

Car obj = new Car();

obj.getDetails(c,a,b,m);
obj.showDetails();
}

}