//        1
//       12
//      123
//     1234
//    12345
 
 class Q101 {  
    public static void main(String[] args) {
                int n = 5;  
        for (int i=1; i<=n; i++) {
            for (int j=n-1; j>=i; j--) {     
                System.out.print(" ");     
            }
            for(int k=1;k<=i;k++){

                System.out.print(k);
            }
        
            System.out.println();
 }
 }
}