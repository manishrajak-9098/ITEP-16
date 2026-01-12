import java.util.Scanner;
class Q38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day number :");
        int num = sc.nextInt();
        
        if(num>=1 && num<=7){
        System.out.println("week 1");
        }
        else if (num>=8 && num<=14){
        System.out.println("week 2");
        }
        else if (num>=15 && num<21){
        System.out.println("week 3");
        }
        else if (num>=22 && num<=28){
        System.out.println("week 4");
        }
        else {
        System.out.println("not in week day");
    }
    }
}