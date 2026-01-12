import java.util.Scanner;
class Q6{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);

    System.out.println("enter a value.");
    int value = sc.nextInt();
     
    value = value*(-1);
    if (value<0)
    System.out.println("value :"+ value);
         }
    }