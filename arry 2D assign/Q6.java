// Addition of two matrix....

class Q6{
    public static void main (String args []){

        int arr1[][]={
            {1, 2, 3},
            {4, 4, 5},
            {6, 7, 8},
        };
        int arr2[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int sum[][]= new int[3][3];
        
            System.out.println("Matrix 1,,");

        for (int r=0; r<arr1.length; r++){
            for(int c=0; c<arr1[r].length; c++){
            System.out.print(" "+arr1[r][c]);
        }
            System.out.println();
        }
        
            System.out.println("Matrix 2,,");

        for (int r=0; r<arr2.length; r++){
            for(int c=0; c<arr2[r].length; c++){
            System.out.print(" "+arr2[r][c]);

            }
            System.out.println();
        }
            System.out.println("Sum of two matrix..");
          
       for(int r=0; r<sum.length; r++){
        for(int c=0; c<sum[r].length; c++){
            sum[r][c]=arr1[r][c]+arr2[r][c];{
                 System.out.print(" "+sum[r][c]);
        }
       } 
            System.out.println();
       }
    }
}
