
public class Q5 {
    public static void main(String[] args) {
        for(int i = 0 ; i<args.length; i++){
            int num = Integer.parseInt(args[i]);
            int rev =0;
            while(num>0){
                int digit = (num%10);
                rev = (rev * 10) + digit;   // reverse number b
                num = (num/10);
            }
            for(String ele : args){
            System.out.println(" element  :"+ele);
            System.out.println("reverse element  :"+rev);
        }
    }
    }
}
