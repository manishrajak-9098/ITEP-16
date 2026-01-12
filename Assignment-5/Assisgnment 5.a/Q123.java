//     A
//    ABC
//   ABCDE
//  ABCDEEF
// ABCDEFGHI

class Q123{
    public static void main (String[]args){
        int n = 5;
        int j =0;
        int k = 0;
        int i=0;
        for( i =1; i<=n; i++){
         char ch =65;
            for ( j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for ( k=1; k<=2*i-1; k++){
            
                System.out.print(ch);
                ch++;
                }
        System.out.println();
                }
            }
        }