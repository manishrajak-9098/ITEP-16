// 21)Program to get marks of 5 subjects from user and find out its grade using nested if else
// Per>=75 && per<=100 Grade A
// Per>=60 && per<75 Grade B
// Per>=50 && per<60 Grade C
// Per>=33 && per<50 Grade D
// else Fail
 import java.util.Scanner;
class Q22{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of 1st subject ");
        int a = sc.nextInt();
        System.out.println("enter marks of 2nd subject ");
        int b = sc.nextInt();
        System.out.println("enter marks of 3rd subject ");
        int c = sc.nextInt();
        System.out.println("enter marks of 4th subject ");
        int d = sc.nextInt();
        System.out.println("enter marks of 5th subject ");
        int e = sc.nextInt();
       
       int Per = (a+b+c+d+e)/5;

       if (Per>=75 && Per<=100 ){
        System.out.println("you got Grade A : ");

       }
       else if(Per>=60 && Per<75) {
        System.out.println("you got Grade B : ");

       }
       else if (Per>=50 && Per<60){
        System.out.println("you got Grade C : ");

       }
       else if (Per >=33 && Per<50){
        System.out.println("you got Grade D : ");

       }
       else{
        System.out.println("you are fail : ");

       }
    }
}