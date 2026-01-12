class Q7{
    public static void main(String[] args){
       int arr[] = new int[args.length];
       for(int i = 0;i<args.length;i++){
        arr[i] = Integer.parseInt(args[i]); 
        }
         for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}