  //Q6. 2 4 6 8 ........n-Terms

import java.util. Scanner;
class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
         int i = 2;

         for (i=2; n!=0; n-- ){
            System.out.println(i);

            i = i+2;
            }
         
        }
    }
