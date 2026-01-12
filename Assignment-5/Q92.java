// 12345
// 1234
// 123
// 12
// 1

class Q92 {
    public static void main(String[] args) {
        int n = 5;
         
        for (int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
               System.out.print(j);
                n++; 
         }
               System.out.println();
        }
       }
     }