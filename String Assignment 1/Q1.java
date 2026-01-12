// Contact no

import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Phone Number : ");
        String num = sc.nextLine();
        while(true){
        if(num.matches("[6789][0-9]{9}")){
            System.out.println("the contact number is : "+num);
            break;
        }
        else {
            System.out.println("Invalid Number ! ");
             System.out.println("Enter Your Phone Number Again : ");
             num = sc.nextLine();
 }
 }
 }
}