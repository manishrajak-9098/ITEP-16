import java.util.Scanner;
class Q34{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1 of triangle");
        int a = sc.nextInt();
        System.out.println("enter side 2 of triangle");
        int b = sc.nextInt();
        System.out.println("enter side 3 of triangle");
        int c = sc.nextInt();
        
        if(a==b && b==c){
            System.out.println("equilateral triangle");
        }
        else if(a==b || b==c || a==c){
            System.out.println("isosceles triangle");
        }
        else{
            System.out.println("scalene triangle");
 }
}
}