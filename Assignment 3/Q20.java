import java.util.Scanner ;
class Q20{
    public static void main( String args []){
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.println("enter 1st number ");
        a = sc.nextInt();
        System.out.println("enter 2 number ");
        b= sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after exchange a="+a +"and b="+b);
 
}

}