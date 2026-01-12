// Product Inventory
// Create a class Product with fields: productId, name, quantity, price.
// Use setters to assign values. Add a method to calculate total value (quantity * price).



class Product{
    private String productId;
    private String name;
    private int quantity;
    private int price;
    private int sum;

    public void setdata(String productId, String name, int quantity, int price,int sum){
    this.productId=productId;
    this.name=name;
    this.quantity=quantity;
    this.price=price;
    this.sum=sum;

}

public void Productdetail(){
    System.out.println("Product id : "+this.productId);
    System.out.println(" Name : "+this.name);
    System.out.println("quantity : "+this.quantity);
    System.out.println("price : "+this.price);
    // System.out.println("total value : "+this.price*this.quantity);
}

public void totalvalue(){
     this.sum = this.price*this.quantity;
    System.out.println(" total value  : "+this.sum);
}

}

class Q5{
    public static void main (String args[]){
        Product pd = new Product();
        pd.setdata("100001 ", "maggie ", 5, 65, 5*65);
        pd.Productdetail();
        pd.totalvalue();
        
    }
}