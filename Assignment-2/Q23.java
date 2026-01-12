import java.util.Scanner;
class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("b0x side");
        int box_side = sc.nextInt();

        System.out.println("length of cartoon");
        int l_cartoon = sc.nextInt();

        System.out.println("breadth of cartoon");
                int b_cartoon = sc.nextInt();
         
          System.out.println("heigth of carttoon");
        int h_cartoon = sc.nextInt();

        
  int volume_of_carton = (l_cartoon*b_cartoon*h_cartoon);
  
  int volume_box_side = (box_side*box_side*box_side);
    int no_of_boxes = (volume_of_carton/volume_box_side);
    System.out.println("volume of carton  "+ volume_of_carton);
    System.out.println("volume_box_side  "+ volume_box_side);
    System.out.println("no.of boxes  "+ no_of_boxes);



    }
    
}
