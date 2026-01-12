// mobile Phone Store
// Create a class Mobile with fields: brand, model, price.
// Use setters to set values. Create a method to check if phone is affordable (price < 20000).

class Mobile {
   private String brandname;
    private String model;
    private float price;

    public void setdata(String brandname, String model, float price){
    this.brandname=brandname;
    this.model=model;
    this.price=price;


}

public void mobiledetail(){
    System.out.println(" mobile Name : "+this.brandname);
    System.out.println("model name : "+this.model);
    System.out.println("price : "+this.price);

}

public void affordable(){
     if(price<20000)
    System.out.println("Mobile is affordable : ");
    else
    System.out.println("Mobile is not affordable : ");

}

}

class Q8{
    public static void main (String args[]){
        Mobile m = new Mobile();
        m.setdata("Redmi phone ","12 series", 250000f);
        m.mobiledetail();
        m.affordable();
        
    }
}