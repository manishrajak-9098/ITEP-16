//  12345
//   1__4
//    1_3
//     12
//      1

class Q112{
    public static void main(String[]arr){ 

    int i=0,j=0;
    int k = 0;

        for(i=5; i>=1; i--){
            for(j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for( k =1; k<=i; k++){
                if(i==k || k==1|| i==5){
                System.out.print(k);
                }
                else{
                    System.out.print("_");
                }
            
                
            }
    System.out.println();
        }
    }
}