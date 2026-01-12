import java.util.Scanner;
class Q36 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("r");
        double r = sc.nextDouble();

        System.out.println("height");
        double height = sc.nextDouble();


        double surface_area_of_cylinder=2*3.14*r*(r+height);
        System.out.println("cylinder"+surface_area_of_cylinder);
    }

    }
    

