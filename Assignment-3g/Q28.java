// 28. Write a program that accepts 5 digit number and replace first and last digit.
// Ex : 45872 o/p: 25874
import java.util.Scanner;
class Replace {
    void Q28(){
        Scanner sc = new Scanner(System.in);

            System.out.println(" enter a 5 digit  value ");
            int num = sc.nextInt();
             int first = num/10000;
             int last = num%10;
             int middle = (num%10000)/10;
             int newNum=(10000*last)+(middle*10)+first;
             System.out.println(" number after swapping : "+newNum);   

    }

}  
class Q28{
    public static void main(String args[]){
        Replace r = new Replace();
        r.Q28();
    }
}

 