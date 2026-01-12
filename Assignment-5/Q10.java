 //10) WAP to print Even numbers upto N.
 
    import java.util .Scanner;

 class Q10{
    public static void main(String[]ar){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a no.");
        int n = sc.nextInt();
        int i;
        for(i=0; i<=n; i++){
           
           if (i%2==0)
           System.out.print(i+ " ");
        }
    }
 }
