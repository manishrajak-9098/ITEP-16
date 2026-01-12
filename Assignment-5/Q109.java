//     1
//    10
//   101
//  1010
// 10101

class Q109{
    public static void main (String args[]){
        int n =5;
        int i=0;
        int j=0;
        for( i=1; i<=n; i++){
          char ch = 65;
            for ( j=n; j>=i; j--){
            System.out.print(" ");
            }

            for(int k =1; k<=i;k++){
            if (k%2==0){
                System.out.print("0");
                }
                else{
                System.out.print("1");
               }
               ch++;
            }
            System.out.println();
              }
            }
        }

