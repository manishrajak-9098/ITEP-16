import java.util.Scanner;
class Q4{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("enter your marks.");
    float marks = sc.nextFloat();

    if(marks<25) {
        System.out.println("your grade is f, fail..."+marks);
    }
    else if(marks>=25 && marks<45){
        System.out.println("your grade is E.."+marks);
    }
        
    else if(marks>=45 && marks<50){
        System.out.println("your grade is...d.."+marks);
    }
    else if(marks>=50 && marks<=60){
        System.out.println("your grade is c.."+marks);
    } 
    else if(marks>60 && marks<=80){
        System.out.println("your grade is b..."+marks);
    }
    else {
        System.out.println("your grade is a");
    }
  } 
}