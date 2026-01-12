import java.util.Scanner;
class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("length");
        int length = sc.nextInt();

        System.out.println("width");
        int width = sc.nextInt();

        System.out.println("cost");
        int cost = sc.nextInt();

        int area;
        int hunders_of_square_of_meters;
       int total_cost;
        area = (length*width);
        hunders_of_square_of_meters = (area/100);
        total_cost = (hunders_of_square_of_meters*cost);
        System.out.println("aera " + area);
        System.out.println("Convert area to hundred of square meter  " + hunders_of_square_of_meters);
        System.out.println("total_cost " + total_cost);
    }


    }

    
