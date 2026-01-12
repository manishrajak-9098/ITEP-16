//7. WAP to search an element in array using binary search.
  
   import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int ele=6;  // Finding element value 
        int low =0;
        int high= arr.length-1;
        int mid=0;
        while(low<=high){
             mid=(low+high)/2;
            if(arr[mid]==ele){
                System.out.println("Your Element index  is "+mid);
                break;
            }
            if(ele<arr[mid]){
                high=mid-1;
            }
            if(ele>arr[mid]){
                low=mid+1;
            }
        }
        if(low>high){
            System.out.println("Element not found ");
        }
    sc.close();
    }
}
