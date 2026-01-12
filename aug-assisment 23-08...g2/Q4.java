import java.util.Scanner;
public class Q4 {
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
        System.out.println("Your sorted array is : ");
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
        
   }
}












// class Q4{
//     public static void main(String args[]){
//         int arr[] = new int[5];
//         int arr []= {1, 2, 3, 5, 4};
//         for (int i = 0; i <arr.length; i++) {
//             for (int j = 0; j < arr.length-1  ; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         System.out.println("Your sorted array is : ");
//         for (int i = 0; i < arr.length; i++) {

//             System.out.println(arr[i]);
//         }
    
//    }
// }