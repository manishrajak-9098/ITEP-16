import java.util.Scanner;

class Product {
    Double price;
    String name_p;
    int pId;


    void getdata(){

        Scanner sc = new Scanner(System.in);

        System.out.print("  Enter product Name : ");
         name_p = sc.nextLine();

        System.out.print("  Enter product id : ");
         pId = sc.nextInt();

        System.out.print("  Enter product price : ");
         price = sc.nextDouble();
    }

    void Display(){

        System.out.println(" \t "+pId +"\t\t   "+name_p +" \t\t   "+price);
    }
}

class Demo{
    public static void main (String...args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of products :");
        int n = sc.nextInt();

        Product arr[] = new Product[n];

        for (int i = 0; i<n; i++){
            arr[i] = new Product();
            arr[i].getdata();
        }
            System.out.println (" Products Details \n ");
            System.out.println (" \t Products Id \t\t "+"Product name\t\t"+"\t price");
            // for (Product P: arr){
            // P.Display();
            // }
             for(int i=0; i<arr.length; i++){
            arr[i].Display();

        }
      // Lowest and Highest price product

        Product lowest = arr[0];
        Product highest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i].price < lowest.price) {
                lowest = arr[i];
            }
				}
            if (arr[i].price > highest.price) {
                highest = arr[i];
            }
      
        System.out.println("\n Lowest Price Product : ");
        lowest.Display();

        System.out.println("\n Highest Price Product : ");
        highest.Display();
    }
}
























   //          System.out.println(" for lowest price product  Type L ");
   //          System.out.println(" for Highest price product  Type H ");
   //          System.out.println(" for Accending order product  Type A ");
   //          char choice = sc.next().charAt(0);

   //          switch (choice){
   //              case 'L':
   //                  int low = Integer.MAX_VALUE;
	// 					  for (int i=0; i<n; i++){
	// 						if (arr[i].price <low)
	// 							low = arr[i].price;

	// 					  }
	// 					for 



   //          }


   //  }














// Q2. Marksheet Generator (Console Application)
// Create a console application that generates a colored marksheet.
// Inputs:
// 1.	Ask for 5 theory subjects:
// o	Subject names
// o	“Out of” marks (enter once for all theory subjects; fixed at 100)
// o	Marks obtained in each theory subject
// 2.	Ask for 2 practical subjects:
// o	Practical names
// o	“Out of” marks (enter once for all practicals; fixed at 25)
// o	Marks obtained in each practical subject
// Validation:
// •	If the user enters marks < 0 or > out-of (i.e., >100 for theory, >25 for practical), re-prompt only for that subject until valid.
// Processing & Rules:
// •	Count how many theory subjects have marks < 33.
// o	If the count is ≥ 3, remark = Year Back
// o	Else if the count is > 0 and < 3, remark = ATKT
// o	Else remark = Pass
// •	Compute totals, percentage, and overall grade based on percentage:
// o	A+ (≥90), A (80–89), B+ (70–79), B (60–69), C (50–59), D (40–33), F (<33)
// Output (Console):
// •	Print a marksheet with:
// o	Proper headings and sectioning
// o	A table for theory and practical marks (Name, Out Of, Obtained)
// o	Totals, percentage, grade, remark
// o	Totals, percentage, grade, remark
// o	Background and foreground colors to give an “official marksheet” feel (use terminal colors)
