// 36. WAP to accept 4 digit number and find out the greatest and smallest digit from it.

import java.util.Scanner;

class Q36{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int n = sc.nextInt();

int No.c = 0;
int temp = n;

while(temp>0){
temp=temp/10;
No.c++;
}

int r1 = n%10;
n=n/10;

int r2 = n%10;
n=n/10;

int r3 = n%10;
n=n/10;

int r4 = n%10;
n=n/10;


if(nc == 4){
int g1 = (r1 > r2) ? r1 : r2;
int g2 = (r3 > r4) ? r3 : r4;
int Greatest = (g1 > g2) ? g1 : g2;

int s1 = (r1 < r2) ? r1 : r2;
int s2 = (r3 < r4) ? r3 : r4;
int Smallest = (s1 < s2) ? s1 : s2;

System.out.println("Greatest didget between them: "+Greatest);
System.out.println("Smallest didget between them: "+Smallest);

}
else{
System.out.println("Enter only 4 digit number!!");
}



}
}