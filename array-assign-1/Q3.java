//3. WAP to program calaculate the sum of all even element and all odd element of array


import java.util.Scanner;
class Q3{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter no. of element to be stored");
    int n = sc.nextInt();
    int i;
    int evensum=0,oddsum =0;

    int arr[] = new int[n]; 
    for(i=0;i<n;i++){
        System.out.println("enter " + (i+1) + " element");
        arr[i]  = sc.nextInt();
    }
        for( i=0;i<arr.length;i++){
        if(arr[i]%2==0){

            evensum+=arr[i];
        }
        else{
        oddsum+=arr[i]; 
        }
      }
            System.out.println("sum of even value.."+evensum);
            System.out.println("sum of odd value..."+oddsum);
    }
}