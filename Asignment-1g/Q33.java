import java.util.Scanner;
class Q33{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int i = 1;
    int term = 9;
    int multiply = 9;

    for(i=1; i<=num; i++){
        System.out.print(term+ " ");
        multiply = multiply *10;
        term = term + multiply;
   
}
}
}
