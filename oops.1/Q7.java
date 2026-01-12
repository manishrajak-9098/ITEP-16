// Student Result Checker
// Create a class Student with fields: name, mathMarks, scienceMarks.
// Use setters to assign values. Add a method getAverage().


class Students{
    private String name;
    private float mathmark;
    private float sciencemark;
    private double average;

    public void setdata(String name, float mathmark, float sciencemark){
    this.name=name;
    this.mathmark=mathmark;
    this.sciencemark=sciencemark;


}

public void studentdetail(){
    System.out.println(" Student Name : "+this.name);
    System.out.println("maths mark : "+this.mathmark);
    System.out.println("science mark : "+this.sciencemark);

}

public void getaverage(){
     average = (  mathmark+sciencemark)/2;
    System.out.println("Average marks : "+average);
}

}

class Q7{
    public static void main (String args[]){
        Students m = new Students();
        m.setdata("Shershah ",90f, 95f);
        m.studentdetail();
        m.getaverage();
        
    }
}