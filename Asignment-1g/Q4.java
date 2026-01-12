// 4) WAP to reverse all the elements of an array
class Q4{
    public static void main(String[] args) {
        String temp ;
        for(int i =0; i<args.length/2; i++){
            temp = args[i];
            args[i]= args[args.length-1-i];
            args[args.length-1-i] = temp;
        }
            System.out.println(" reverse element are :\n");
            for(String ele : args){
                System.out.print(ele);
            }
    }
}