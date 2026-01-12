// 14.Create a class Product with data members (pid, pname, amount) and declare and define the member function 
// 1.acceptProduct()-- which accept product details.
// 2.displayProduct() -- display product information.
 
 import java.util.Scanner;
 class Product{
    int pId;
    String pName;
    double amount;

    void acceptProduct(String pName, int pId, double amount){

        this.pName = pName;
        this.pId = pId;
        this.amount = amount;

    }
    void displayProduct(){
        System.out.println("Product Name : "+pName);
        System.out.println("Product Id : "+pId);
        System.out.println("Product Amount : "+amount);
    }
 }

 class Q14{
    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name ");
        String pName = sc.nextLine();

        System.out.println("Enter product id");
        int pId = sc.nextInt();

        System.out.println("Enter a amount ");
        double amount = sc.nextDouble();

        Product obj = new Product();
        obj.acceptProduct(pName, pId, amount);
        obj.displayProduct();

    }
 }