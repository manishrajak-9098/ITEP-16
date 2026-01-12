// calculate the sum of all even element and all odd element of matrix 
// 1 2 3 
// 4 5 6 
// 7 8 9

class Q1{
    public static void main (String args []){

        int arr[][]= {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
        };
            int evensum= 0;
            int oddsum=0;

            for (int r=0; r<arr.length; r++){
            for (int c=0; c<arr[r].length; c++){
            if ( r%2==0&&  c%2==0){
                evensum+=arr[r][c];
            }
            else{
                oddsum+=arr[r][c];
            }
            }
            }
            System.out.println(evensum);
            System.out.println(oddsum);
        }
    }
