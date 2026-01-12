import java.util.Scanner;
class Q37{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Number is Palindrome or Not : ");
        int n = sc.nextInt();
        
        int temp =n;
        int reminder=0;
        int reverse=0;
         
        while(n!=0){
            reminder = n%10;
            System.out.print(reminder);
            reverse = (reverse*10) + reminder;
            n = n/10;
        }
            // System.out.print(nrev);

        if(temp == reverse){
            System.out.print("\n It is a Palindrome Number");        
            }
    
        else{
            System.out.print("\n It is not a Palindrome Number");
        }
   } 
}