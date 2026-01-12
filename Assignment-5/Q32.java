// 32) A	b	C	d	E	f	G	h	…… n terms 
import java.util.Scanner;
class Q32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        char capital = 'A';
        char small = 'a';
        int i = 1;
     

        while(i<=n){
            if( i % 2 == 1){
                System.out.print(capital+ " ");
            }else{
                System.out.print(small+ " ");
            }
            i++;
            capital++;
            small++;
        }

        // another way of doing this using for loop
        // for(int i=65; n!=0; n--){
        //     if(i%2==1)   System.out.print((char)(i)+" ");
        //     else    System.out.print((char)(i+32)+" ");
        //     i++;
   // }

 }
}
