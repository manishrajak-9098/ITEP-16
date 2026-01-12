
import java.util.Scanner;
 class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value " + (i + 1));
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1  ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Your minimum array is : ");
        // for (int i = 0; i < n; i++) {

        //     System.out.println(arr[i]);
            System.out.println(arr[0]);
        // }
        
   }
}

