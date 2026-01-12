 // 10.Create a class Student with data member (rno, fees and static member totalFees).
 // Create parameterized constructor  which update the totalFees and
//  create member function which prints the total fees collected of all the students.

import java.util.Scanner;
class Student{
    int rno;
    double fee;
    static double totalfees = 0;

    Student(int rno, double fee){
        this.rno = rno;
        this.fee = fee;
        totalfees +=fee;
    }

     void show(){
        System.out.println("\nroll no :  "+rno);
        System.out.println("fees  :  "+fee);
        
    }
    static void totalFeesShow(){
        System.out.println("\nTotal fees :  "+totalfees);

    }

}

class Q10{
    public static void main(String...arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no . of Students");
        int num = sc.nextInt();

        Student[] st = new Student[num];

        for(int i =0; i<num; i++){
        System.out.println("Enter rno "+(i+1)+" of Students");
        int rno = sc.nextInt();
        System.out.println("Enter fees "+(i+1)+" of Students");
        double fee = sc.nextDouble();

        st[i] = new Student(rno, fee);
        }

        System.out.println("\nStudents details ");

           for (Student s : st) {
            s.show();
        }

        // display total fees
        Student.totalFeesShow();

            
        }

    }


// import java.util.Scanner;

// class Student {
//     int rno;
//     double fees;
//     static double totalFees = 0;  // static member for all students

//     // Parameterized Constructor
//     Student(int r, double f) {
//         rno = r;
//         fees = f;
//         totalFees += f; // add this student's fee to total
//     }

//     // Function to display total fees
//     static void showTotalFees() {
//         System.out.println("Total Fees Collected: " + totalFees);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();

//         // object array
//         Student[] arr = new Student[n];

//         // input students data
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter roll no of student " + (i + 1) + ": ");
//             int r = sc.nextInt();
//             System.out.print("Enter fees of student " + (i + 1) + ": ");
//             double f = sc.nextDouble();

//             // object create and store in array
//             arr[i] = new Student(r, f);
//         }

//         // display total fees collected
//         Student.showTotalFees();
        
//         sc.close();
//     }
// }
