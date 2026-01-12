// 123456
// 54321
// 1234
// 321
// 12
// 1

  class Q100 {
    public static void main(String[] args) {
         
        for (int i=6; i>=1; i--) {
        int n = i;
            for (int j=1; j<=i; j++) {
                if (i%2==0){
               System.out.print(j);
              }
               else{   
               System.out.print(n--);  
                 
         }
         }
               System.out.println();
        }
       }
     }