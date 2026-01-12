// 40. WAP to program to take 6 digit number from user and checks whether it is palindrome or not

import java.util.Scanner;

class Q40{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a six digit number: ");
int num = sc.nextInt();

int temp = num;

int r1 = num%10;
num=num/10;
int r2 = num%10;
num=num/10;
int r3 = num%10;
num=num/10;
int r4 = num%10;
num=num/10;
int r5 = num%10;
num=num/10;
int r6 = num%10;
num=num/10;

int ReversedNo =( (r1 * 100000) + (r2 * 10000) + (r3 * 1000) +  (r4 * 100) + (r5 * 10) + (r6 * 1));

System.out.println("Reversed number: "+(ReversedNo));

if(temp==ReversedNo){
System.out.println("it is a Palindrome number");
}
else{

System.out.println("it is not a Palindrome number");
}


}
}