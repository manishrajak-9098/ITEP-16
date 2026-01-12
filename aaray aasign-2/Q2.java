// Q.2 Find minimum and maximum element in array
import java.util.Scanner;
class Q2{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    int arr[] = {2, 5,3, 1, 3};
    int i;
 
    for(i=0;i<=arr.length;i++){ 
      for (int j = 0; j < arr.length-1; j++) {
              if (arr[j] > arr[j + 1]) {  
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;

    }

    }
    }
            System.out.println("minimum element array "+arr[0]);
            System.out.println("maximum element array "+arr  [arr.length-1]);
}
} 