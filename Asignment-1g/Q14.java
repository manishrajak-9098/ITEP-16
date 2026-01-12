//  13) WAP to find out average of 5 numbers
import java.util.Scanner;
 class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int arr[] = new int [5];

        System.out.println("Enter 5 no ");
        for(int i=0; i<5; i++){
        arr[i] = sc.nextInt();
        sum = sum+ arr[i];

        }
            average = (sum/arr.length);
            // for(int i =0; i<5; i++){
            //     System.out.println("Average : "+average);
            // }

    System.out.println(" Sum of all elemrnt : "+sum);
    System.out.println(" Average of  element : "+average);
    
    }

}
