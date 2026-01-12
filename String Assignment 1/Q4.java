//palindrome
import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        char words[] = content.toCharArray();
        boolean flag = false;
        
        for(int i = 0 ;i<words.length/2 ; i++){
            char temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        String rev = new String(words);
        if(content.equals(rev))
        System.out.println("it is an palindrome");
        else
        System.out.println("not an palindrome");

}
}