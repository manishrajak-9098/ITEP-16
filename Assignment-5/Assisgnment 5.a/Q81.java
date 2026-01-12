// 1
// 12
// 1 3
// 1  4
// 12345

class Q81 {
    public static void main(String[] args) {
        int n = 5;  
        for (int i=1; i<=n; i++) {
    
            for (int j=1; j<=i; j++) {
                if ((i==5)||(i==j)||(j==1))
                System.out.print(j);  
                else
                System.out.print(" ");
            }
        
            System.out.println();
 }
 }
}