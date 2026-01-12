// 6) Program to check whether entered character is a $ or @ by its ascii value

import java.util.Scanner;

class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char ch ='a';
        // char cha ='$';
        // char chae ='@';
        System.out.println("Enter a ascii value: ");

        if(97=='a'|| 36=='$'||64=='@'){
        int n = sc.nextInt();
        System.out.println(" convert into character: " + ((char)(n)));
        int h = sc.nextInt();
        System.out.println("convert into  character: " + (char)(h));
        int p = sc.nextInt();
        System.out.println(" convert into character: " + (char)(p));

        }
        else {
        System.out.println(" invalid value : " );

        }
    }
}