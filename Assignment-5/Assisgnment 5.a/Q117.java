 //         *
 //       * *
 //     * * *
 //   * * * *
 // * * * * *

class Q117{
    public static void main(String[]arr){
    int i=0,j=0;
    int n = 5;
    for (i=1; i<=n; i++){
        for (j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int k=1; k<=i; k++){
            System.out.print("*");
        }
    System.out.println();
    }
    }
}
     