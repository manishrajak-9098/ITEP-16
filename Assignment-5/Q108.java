//     A
//    AB
//   A_C
//  A__D
// ABCDE

class Q108{
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
            if (i==5||i==k||k==1){
                System.out.print(ch);
                }
                else{
                System.out.print(" ");
               }
               ch++;
            }
        System.out.println();
              }
            }
        }


