//     1
//    11
//   1*1
//  1**1
// 11111


class Q107{
    public static void main (String args[]){
        int n =5;
        int i=0;
        int j=0;
        for( i=1; i<=n; i++){
            for ( j=n; j>=i; j--){
            System.out.print(" ");
            }

            for(int k =1; k<=i;k++){
            if (i==5||i==k||k==1){
                System.out.print("1");
                }
                else{
                System.out.print("*");
               }
            }
        System.out.println();
              }
            }
        }


