// 15.	Create a class Student (rollno, name) which keeps track of how many objects are created of the class.
//  Every time object of the class is created, it should display number of total objects created.

 import java.util.Scanner;
 class Student{
    int rollNo;
    String name;
    static int count;

     Student(String name, int rollNo){

        this.name = name;
        this.rollNo = rollNo;
        count++;

    }
 }

 class Q15{
    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter no of Student");
        int n = sc.nextInt();

       
        Student[] obj = new Student[n];

        for(int i = 0; i<n; i++){
        System.out.println("\nEnter "+(i+1)+" Student details:- ");
        sc.nextLine();
        System.out.println("Enter Student name ");
        String name = sc.nextLine();

        System.out.println("Enter Roll no");
        int rollNo = sc.nextInt();

            obj[i] = new Student(name, rollNo);
        }

    System.out.print("No. of object Created : "+Student.count);

    }
 }