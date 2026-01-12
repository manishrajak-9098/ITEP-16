 class Q6 {
    public static void main(String[] args) {
    double a = 10;
    double b = 9;
    double perimeter = 36;
    double c;
    double area;
    double side;
 
    c =(perimeter-a-b);
     side = (a+b+c)/2; 
    area = Math.sqrt(side*(side-a)*(side-b)*(side-c));

    System.out.println("side c " + c);
    System.out.println("side " +side);
    System.out.println("area " +area);
     
    }
    
}
