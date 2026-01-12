// 34. Create a class Person with properties (name and age) with following features.
// a. Default age of person should be 18;
// b. A person object can be initialized with name and age;
// c. Method to display name and age of person .
// Create and use copy constructor for above problem.



 class Person {
    String name ;
    int age =18;
    // Person(String name ,int age ){
    //     this.name=name ;
    //     this.age=age;
    // }
    Person(String name , int age){
  this.name=name;
  this.age=age;

    }
    void display(){
        System.out.println("NAME IS "+name);
        System.out.println("AGE IS "+age);
    }
    Person(Person ob){
        this.name = ob.name ;
        this.age = ob.age ;

    }


 }
public class Q34 {
    public static void main(String[] args) {
    Person p1= new Person("Hello",33);
    Person p34= new Person(p1);
    p34.display();
    // p1.Person34(p1);
     
    }
   }
