// 28) Program to convert mm to inches



import java.util.Scanner;
class Q28{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value  in mm : ");
        float mm = sc.nextInt();
    
           float inc = mm*0.03937f;
        System.out.println("convert meter  into meter "+inc);
    }
}