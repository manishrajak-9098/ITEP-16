// 11) WAP showing the concept of Insertion sort
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            arr[i] = sc.nextLine();
        }

        // Bubble Sort for Strings
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
