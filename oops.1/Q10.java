// Rectangle Area Calculator
// Create a class Rectangle with fields: length, width.
// Use setters to assign values. Add a method to calculate area.


class Rectangle {
   private float length;
    private float width;
    private float area;


    public void setdata(float length, float width){
        this.length=length;
        this.width=width;

}

public void rectangledetail(){
    System.out.println(" length of rectangle : "+this.length);
    System.out.println(" width of rectangle : "+this.width);

}


public void area(){
     area=length*width;
     System.out.println("area of rectangle : "+area);
}
}


class Q10{
    public static void main (String args[]){
        Rectangle rg = new Rectangle();
        rg.setdata(7f, 9f);
        rg.rectangledetail();
        rg.area();
        
        
}
}