// Movie Rating System
// Create a class Movie with fields: name, genre, and rating.
// Use setters and create a method isHit() that returns true if rating ≥ 8.0.


class Movie{
    private String name;
    private String genre;
   private  float rating;

    public void setdata(String name, String genre, float rating){
    this.name=name;
    this.genre=genre;
    this.rating=rating;

}

public void moviedetail(){
    System.out.println(" Movie Name : "+this.name);
    System.out.println("genre : "+this.genre);
    System.out.println("Rating : "+this.rating);

}

public boolean isHit(){
     if(this.rating>=8)
         return true;
     else
        return false;

}

}

class Q6{
    public static void main (String args[]){
        Movie m = new Movie();
        boolean movie = false;
        m.setdata("Shershah ", " Biography ", 9.5f);
        m.moviedetail();
        movie = m.isHit();
        System.out.println("is movie Hit  : "+movie);
    }
}