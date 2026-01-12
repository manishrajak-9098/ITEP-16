import java.util.Scanner;
class Q36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter angle 1 of triangle");
        int a = sc.nextInt();GG
        System.out.println("enter angle 2 of triangle");
        int b = sc.nextInt();
        System.out.println("enter angle 3 of triangle");
        int c = sc.nextInt();

        if((a+b+c) == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("not a Valid Triangle");
 }
}
}