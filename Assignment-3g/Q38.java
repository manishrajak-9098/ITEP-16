// 38. Write a program to enter three subject marks (out of 100). 
// Check if student is pass or Fail,only if he/she scores greater than 75 in each subject 
// and the average of all three subject marks should also be greater than 80.

import java.util.Scanner;
class Q38{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a marks of sub1 : ");
        int Sub1 = sc.nextInt();
        System.out.println ("Enter a marks of sub2 : ");
        int Sub2 = sc.nextInt();
        System.out.println ("Enter a marks of sub3 : ");
        int Sub3 = sc.nextInt();
        int averageMark=(Sub1+Sub2+Sub3)/3;
        int totalMarks = Sub1+Sub2+Sub3;
        System.out.println("\nTotal marks of Students in Each Subject : "+totalMarks);
        System.out.println("\nAverage  marks of Students  Subject : "+averageMark);


    int count=0;
        // if(Sub1>=75){
        //     count ++;
        // }
        // if(Sub2>=75){
        //     count ++;
        // }
        // if(Sub3>=75){
        //     count ++;
        // }

        // if
        if ((Sub1>=75)|| (Sub2>=75) || (Sub3>=75)){
        count++;
        }
            if(count==3 && averageMark>=80){
                System.out.println("\nCongratulations you are pass ");
            }
            else {
                System.out.println("\n Bad luck you are fail, Try again don't demotivated ");

            }




    }
}



// import java.util.Scanner;

// class Q38{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter subject 1: ");
// int s1 = sc.nextInt();
// System.out.print("Enter subject 2: ");
// int s2 = sc.nextInt();
// System.out.print("Enter subject 3: ");
// int s3 = sc.nextInt();

// int c = 0;
// int avg = (s1 + s2 + s3)/3;
// int tmarks = s1 + s2 + s3;
// System.out.println("Total marks: "+tmarks);

// if( (s1 >= 75) ){
// if( (s2 >= 75) ){
// if( (s3 >= 75) ){
// c++;
// }
// c++;
// }
// c++;
// }


// if((c==3) && (avg>=80)){
// System.out.println("Congratulations Pass!!
// +");
// }
// else{
// System.out.println("Opps Fail!!");
// }


// }
// }