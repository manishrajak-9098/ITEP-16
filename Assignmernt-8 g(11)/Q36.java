import java.util.Scanner;

class Product{
int pid;
int price;
int quant;
int tprice;
static int sum = 0;

Product(int pid,int price,int quant,int tprice){
this.pid = pid;
this.price = price;
this.quant = quant;
this.tprice = tprice;
}


void showPro(){
System.out.println(pid +"\t\t"+price+"\t\t"+quant+"\t\t\t"+tprice);
}

static int totalPrice(Product[] arr){
for(int i=0;i<5;i++){
sum += arr[i].tprice; 
}
return sum;
}

}

class Q36{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

Product prArr[] = new Product[5];

for(int i=0;i<5;i++){
System.out.println();
System.out.println("Enter "+(i+1)+" product details:-  ");
System.out.print("Enter ID: ");
int pid = sc.nextInt();
System.out.print("Enter price: ");
int price = sc.nextInt();
System.out.print("Enter quantity: ");
int quant = sc.nextInt();

int tprice = price * quant;

prArr[i] = new Product(pid,price,quant,tprice);
}


System.out.println("========================Product Details==========================");
System.out.println("ID \t\tPrice \t\tQuantity \t\tTotal Price");
for(int i=0;i<5;i++){
prArr[i].showPro();
}


System.out.println();
int max = 0;
System.out.println("====================Highest Price Product========================");
System.out.println("ID \t\tPrice \t\tQuantity \t\tTotal Price");

for(int i=0;i<5-1;i++){
if(prArr[i].price > prArr[i+1].price){
max = i;
}
}

prArr[max].showPro();


System.out.println();
System.out.println("Total price of all products: "+Product.totalPrice(prArr));






}
}