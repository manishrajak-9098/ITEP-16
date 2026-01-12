
//Spaces
import java.util.Scanner;
class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i]==' '){
                count++;
            }
        }
        System.out.println("Spaces Are : " +count);
   }
}