import java.util.Scanner;
class Q38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Check Number is Armstrong or Not : ");
        int n = sc.nextInt();
 
        int temp = n; 
        int sum = 0 ;
        while(n!=0){
           int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        System.out.println(sum);
        if(temp == sum){
            System.out.print("\n It is a Armstrong Number");        
            }
    
        else{
            System.out.print("\n It is not a Armstrong Number");
        }
   }
}







// import java.util.Scanner;
// class armstrong{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("enter no.. ");
//         int num = sc.nextInt();

//         int count=0;
//         double sum=0;
//         int temp = num;
//         int temp1 = num;

//         while (num>0){
//             count++;
//             num=num/10;

//         }
//         while (temp>0){
//             int rem = temp%10;

//             sum = sum  + Math.pow(rem,count);
//             temp=temp /10;
//         }

//         if (sum==temp1)
//         System.out.println("armstrong ");
//         else
//         System.out.println("not  armstrong ");

//     }
  
// }