import java.util.Scanner;
class Q37 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("area");
    float area = sc.nextFloat();

    System.out.println("height");
    Float height = sc.nextFloat();


    float radius = area/(2* 3.14f * height);
    float dia = radius*2;
    System.out.println("dia " +dia);

}    
}
