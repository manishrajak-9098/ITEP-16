//2. WAP to program to calculate the sum of all element of array.
 

  import java.util.Scanner;
class Q2{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no. of element to be stored");
    int n = sc.nextInt();
    int i;
    int sum=0;

    int arr[] = new int[n]; 
    for(i=0;i<n;i++){
        System.out.println("enter " + ( i+1) + " element");
        arr[i] = sc.nextInt();

        sum+=arr[i];
    }
    System.out.println("sum of numbers :- "+sum);
    }
}
