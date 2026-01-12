import java.util.Scanner;
class Q8{
    public static void main (String args[]){

     Scanner sc = new Scanner(System.in);
    System.out.println("enter y or n " );

    char answer = sc.next().charAt(0);
    System.out.println(answer);
    
    if(answer == 'y'){
    System.out.println("allow in exam ");
    
    }
    else if (answer== 'n' ){
     System.out.println("not allow to sit in exam");

           }
        }
     }