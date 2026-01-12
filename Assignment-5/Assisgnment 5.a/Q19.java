//Q19. 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n 

import java.util.Scanner;

 class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");

        int n = sc.nextInt();
        float i = 1, sum = 0,t=0;
        
        for (i=1; i<=n; i++ ){
             sum = 1/i;
            t = sum + t;

        

        }
         System.out.println(t + " ");
 }
           

}
