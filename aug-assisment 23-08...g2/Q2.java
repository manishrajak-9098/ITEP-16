import java.util.Scanner;

class Book{
    int page;
    String name_A;
    int Eyear;

    void getdata(){

        Scanner sc = new Scanner(System.in);

        System.out.print("  Enter book Author Name : ");
         name_A = sc.nextLine();

        System.out.print("  Enter book page : ");
         page = sc.nextInt();

        System.out.print("  Enter edition year of book : ");
         Eyear = sc.nextInt();
    }
    void Display(){
        System.out.println(" \t "+name_A +"\t\t   "+Eyear +" \t\t   "+page);
    }
}

class Q2{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of books :");
        int n = sc.nextInt();

        Book arr[] = new Book[n];

        for (int i = 0; i<n; i++){
            arr[i] = new Book();
            arr[i].getdata();
        }
            System.out.println (" Books Details \n ");
            System.out.println (" \t Author Name \t\t "+" Edition year\t\t"+"\t Page no.");
            
             for(int i=0; i<arr.length; i++){
            arr[i].Display();

        }
        Book highest = arr[0];

        for (int i = 0; i < n; i++) {
           
		
            if (arr[i].page > highest.page) {
                highest = arr[i];
            }
      }
       
        System.out.println("\n Highest No. of pages : ");
        highest.Display();
    }
}
