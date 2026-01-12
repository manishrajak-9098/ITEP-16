//5. WAP to replace all element with 0 which is multiple of 5

 import java.util.Scanner;
class Q5 {
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
     
     for (i=0;i<n;i++){
        if(arr[i]%5==0){
        System.out.println("0");
        continue;
        }
        else{
                System.out.println(arr[i]);

        }
     }
    }
} 