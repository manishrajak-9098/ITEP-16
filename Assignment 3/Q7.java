import java.util.Scanner;
class Q7{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("Number of classes held");
    int totalclasses = sc.nextInt();

    System.out.println("Number of classes attended.");
    int attendence = sc.nextInt();

    double percentage = (attendence*100)/totalclasses;

    if(percentage>75){
    System.out.println("A student will be allowed to sit in exam");
    }
    else {
        System.out.println("A student will not be allowed to sit in exam");
    }
    }
}