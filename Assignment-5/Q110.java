// 12345
//  1234
//   123
//    12
//     1

class Q110{
    public static void main(String[]arr){

    int i=0,j=0;
    int k = 0;

        for(i=5; i>=1; i--){
            for(j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for( k =1; k<=i; k++){
                System.out.print(k);
            }
    System.out.println();
        }
    }
}
 