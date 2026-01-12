// A
// AB
// A C
// A  D
// ABCDE

class Q83 {
    public static void main(String[] args) {
        int n = 5;  
        for (int i=1; i<=n; i++) {
    
            for (int j=1; j<=i; j++) {
                if ((i==5)||(i==j)||(j==1))
                System.out.print((char)(65+j-1));  
                else
                System.out.print(" ");
            }
        
            System.out.println();
 }
 }
}
