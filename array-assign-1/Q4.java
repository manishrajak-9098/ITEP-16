//4. WAP to find an element in array.
 
  import java.util.Scanner;
  class Q4 {
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no. of element to be stored");
    int n = sc.nextInt();
    int i;

    int arr[] = new int[n]; 
    for(i=0;i<n;i++){
        System.out.println("enter " + (i+1) + " element");
        arr[i] = sc.nextInt(); 
    }
    System.out.println("select the value of that element");
    int k = sc.nextInt();

    for(i=0; i<n; i++){
    if(arr[i]==k){
     System.out.println("index no. is "+i+" and the element found "+ arr[i]);
     break;
    }

    }

    if(arr[i]==n+1)
    System.out.println("element not found ");

    }
}
