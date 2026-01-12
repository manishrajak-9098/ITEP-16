// 1
// 10
// 1 1
// 1  0
// 10101

class Q88 {
    public static void main(String[] args) {
        int n = 5;  
        for (int i=1; i<=n; i++) {

            for (int j=1; j<=i; j++) {
                if ((i>=5)||(i==j)||(j==1)){
                    if(j%2==0){
                System.out.print("0");
                    }  
                else {
                System.out.print("1");
                    }
                    }
                else 
                System.out.print(" ");
            }
        
            System.out.println();
 }
 }
}