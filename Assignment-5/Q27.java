//27) *	#	*	#	*	#	*	#	*	…….

 import java.util.Scanner;
 class Q27{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();

    int i=1;
    for(i=1;i<=n;i++){
        if(i%2==0)
        System.out.print("#"+" ");
        else
        System.out.print("*"+" ");
        
    }
    }
 }