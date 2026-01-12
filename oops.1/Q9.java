// Circle Geometry
// Create a class Circle with field radius.
// Use a setter to assign radius. Add methods to compute area and circumference.


class Circle {
    private float radius;
    private float area;
   private float  circumference;

    public void setdata(float radius){
        this.radius=radius;

}

public void circledetail(){
    System.out.println(" Radius of circle : "+this.radius);

}


public void area(){
     area=3.14f*radius*radius;
     System.out.println("area of circle : "+area);
}
public void circumference(){
     circumference =2*3.14f*radius;
     System.out.println("area of circumference : "+circumference);
    
}
}


class Q9{
    public static void main (String args[]){
        Circle cl = new Circle();
        cl.setdata(7f);
        cl.circledetail();
        cl.area();
        cl.circumference();
        
    
}
}