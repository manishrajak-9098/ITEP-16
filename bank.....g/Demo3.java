class Grandp{
    Grandp(){
        System.out.println(" Grand parent constructer called ");
    }
    void show(){
        System.out.println("Grand show method called");
    }
}
class Parent extends Grandp{
    Parent(){
        System.out.println("parent cons.. called");
    }
    void show(){
        super.show();
        System.out.println("parent show method called");
    }
} 
class Child extends Parent{
    Child(){
        System.out.println("child constructer called");
    }
    void display(){
        show();
    }
}

class Demo3{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}