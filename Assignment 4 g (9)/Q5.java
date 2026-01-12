// 5) WAP to create a menu and find out area of circle, square, rectangle and trapezium 
import java.util.Scanner;
class Q5{
    public static void main (String...args){
    Scanner sc = new Scanner (System.in);
    int n1 = 0,n2=0,n3=0;
    float result=0;


    System.out.println("Chose any given type for operation ");
    System.out.println("for area of circle press A, a");
    System.out.println("for area of Square press S, s");
    System.out.println("for area of rectangle press R s");
    System.out.println("for area of Trapezium  press T, t");
     char ch = sc.next().toLowerCase().charAt(0);
    if(ch=='A'||ch=='a'|| ch=='s'||ch=='S'){
    System.out.println("Enter Radius/Side ....");
     n1 = sc.nextInt();

    } 
    else if (ch== 't'||ch=='T'){

    System.out.println("Enter 3 no.....");
     n1 = sc.nextInt();
     n2 = sc.nextInt();
     n3 = sc.nextInt();

    }

    else {
    System.out.println("Enter two no.....");
     n1 = sc.nextInt();
     n2 = sc.nextInt();
    }   

    
    switch (ch){
        case 'a' : result=  (float)3.14f*n1*n1  ; break;
        case 's' : result=  n1*n1 ; break;
        case 'r' : result=  n1*n2  ; break;
        case 't' : result=  (1/2)*(n1+n2)*n3 ; break;
        default : System.out.println("invalid data !!"); break;
        
        }
        System.out.println("result : "+result);



    }
}