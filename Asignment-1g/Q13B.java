// 2) Loops Programs
import java.util.Scanner;
class loop{
    void prime(int n){
        int count =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if (count ==2){
            System.out.println("it is a prime no.");
        }
        else{
            System.out.println("it is not a prime no. ");
        }
    }
}

class Q13B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int n = sc.nextInt();
        loop obj = new loop();
        obj.prime(n);
        
    }
}
