// car Info Manager
// Create a class Car with fields: brand, model, and year.
// Use setters to assign values. Create a method to print full car info.



class Car{
    private String brand;
    private String model;
    private int year;

    public void setdata(String brand, String model, int year){
    this.brand=brand;
    this.model=model;
    this.year=year;

}

public void carinfo(){
    System.out.println("Brand name : "+this.brand);
    System.out.println("Model Name : "+this.model);
    System.out.println("Year : "+this.year);
}

}

class Q4{
    public static void main (String args[]){
        Car cr = new Car();
        cr.setdata("Mahindra ", "7862110 ", 2025);
        cr.carinfo();
    }
}