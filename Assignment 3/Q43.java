import java.util.Scanner;
class Q43{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the electricity unit");
        int EU = sc.nextInt();
        double a=0.5*EU;
        double b=0.75*EU;
        double c=1.20*EU;
        double d=1.5*EU/100*20 ;
        

        if(EU<=50)
        System.out.println(" electricity unit cost is : "+a);
        else
        if(EU>=50 && EU<=150)
        System.out.println(" electricity unit cost is : "+b);
        else
        if(EU>150 && EU<=250)
        System.out.println(" electricity unit cost is : "+c);
        else  if(EU>250)
        System.out.println(" electricity unit cost is : "+d);
    }
}
