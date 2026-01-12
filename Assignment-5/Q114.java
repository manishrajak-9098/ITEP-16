// ABCDE
//  A__D
//   A_C
//    AB
//     A


class Q114{
    public static void main(String[]arr){ 

    int i=0,j=0;
    int k = 0;

        for(i=5; i>=1; i--){
        char ch = 65;
            for(j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for( k =1; k<=i; k++){
                if(i==k || k==1|| i==5){
                System.out.print(ch);
                }
                else{
                    System.out.print("_");
                }
            ch++;
                
            }
    System.out.println();
        }
    }
}