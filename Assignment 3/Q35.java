import java.util.Scanner;
class Q35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("character...");
        char alphabet = sc.next().charAt(0);

        if((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z')){
        System.out.println("this is alphabet..."+alphabet);
        }
        else {
        System.out.println("this is not alphabet."+alphabet);
        }
    }
}