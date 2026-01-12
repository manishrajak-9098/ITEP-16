// 1) WAP to take n number of elements of an array and 
// find out the sum of first and last element of an array. 
 class Q1 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("ivalid argument plzz enter some argument");

        }
        int first = Integer.parseInt(args[0]);
        int last = Integer.parseInt(args[args.length-1]);

        int sum = first+last;
        System.out.println("Sum of first and last element :"+sum);
        
    }

    
}


