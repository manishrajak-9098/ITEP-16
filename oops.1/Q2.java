// Book Library
// Create a class Book with fields: title, author, and price.
// Use setters to assign values and a method to print book detail

class Book{
    private String title;
    private String Author_name;
    private float price;

    public void setdata(String title, String Author_name, float price){
        this.title=title;
        this.Author_name=Author_name;
        this.price=price;

    }
    public void  bookdetail(){
        System.out.println("book title  : "+this.title);
        System.out.println("Author Name  : "+this.Author_name);
        System.out.println("price of books  : "+this.price);

    }
}
class Q2{
    public static void main (String args[]){
        Book man = new Book();
        man.setdata("Desh","mani",500f);
        man.bookdetail();
    }
}