//      5
//     44
//    333
//   2222
//  11111

class Q103 {
    public static void main(String[] args) {
            int n = 5;  
            int s = 5;
        for (int i=1; i<=n; i++) {
              
            for (int j=n-1; j>=i; j--) {     
                System.out.print(" ");     
            }
            for(int k=1;k<=i;k++){

                System.out.print(s);
            }
             s--;
           
        
            System.out.println();
 }
 }
}
