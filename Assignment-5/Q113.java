// 55555
//  4__4
//   3_3
//    22
//     1

class Q113{
    public static void main(String[]arr){ 

    int i=0,j=0;
    int k = 0;

        for(i=5; i>=1; i--){
            for(j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for( k =1; k<=i; k++){
                if(i==k || k==1|| i==5){
                System.out.print(i);
                }
                else{
                    System.out.print("_");
                }
            
                
            }
    System.out.println();
        }
    }
}