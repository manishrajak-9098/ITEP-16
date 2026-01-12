// A
// BCD
// EFGHI
// JKLMNOP

class Q105{
    public static void main(String[] args) {
        int n = 5;  
        char ch = 65;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=(2*i-1); j++) {
               System.out.print (ch);
                ch++;
         }
               System.out.println();
        }
       }
     }