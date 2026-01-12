import java.util.Scanner;

class Publication{
Scanner sc = new Scanner(System.in);
String title;
int price;

void getData(){
System.out.print("Enter title: ");
title = sc.nextLine();
System.out.print("Enter price: ");
price = sc.nextInt();
}

void putData(){
System.out.println("Title         : "+title);
System.out.println("Price         : "+price);
}

}

class Sales extends Publication{
int s1,s2,s3;

void getSales(){
System.out.print("Enter sale of month 1: ");
s1 = sc.nextInt();
System.out.print("Enter sale of month 2: ");
s2 = sc.nextInt();
System.out.print("Enter sale of month 3: ");
s3 = sc.nextInt();
}

void showSales(){
System.out.println("Month 1 sales : "+s1);
System.out.println("Month 2 sales : "+s2);
System.out.println("Month 3 sales : "+s3);
}
}

class Book extends Sales {
int pages;

void getBookDetails(){
getData();
getSales();
System.out.print("Enter number of pages: ");
pages = sc.nextInt();
}

void showBookDetails(){
System.out.println("========Book details=========");
putData();
showSales();
System.out.println("Pages         : "+pages);
}

}

class Q25{
public static void main(String args[]){
Book obj = new Book();

obj.getBookDetails();
System.out.println();
obj.showBookDetails();

     }
 }