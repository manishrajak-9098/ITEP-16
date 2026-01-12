// 1 2 3 
// 4 5 6 
// 7 8 9
// output:- 1 5 9

class Q2{
    public static void main (String args []){

        int arr[][]= {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
        };

        for (int r = 0; r<arr.length; r++){
            for (int c = 0; c<arr[r].length; c++){
                if (r==c){
                    System.out.println(arr[r][c]);
                }
            }
        }
    }
}