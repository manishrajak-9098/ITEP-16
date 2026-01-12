import java.util.Scanner;
class Q18{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number: ");
int n = sc.nextInt();

int a=1,b=2,c=0;
System.out.println(a);
System.out.println(b);

for( ;n!=2;n--){
c = a * b;
System.out.println(c);
a=b;
b=c;

        }

     }

  }
