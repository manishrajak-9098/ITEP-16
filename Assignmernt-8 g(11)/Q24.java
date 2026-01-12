import java.util.Scanner;

class Rectangle{
protected int length;
protected int breadth;

Rectangle(int l,int b){
this.length = l;
this.breadth = b;
}

}

class Area extends Rectangle{

Area(int l,int b){
super(l,b);
}

int area = length * breadth;

int display(){
return area;
}
}

class Perimeter extends Rectangle{

Perimeter(int l,int b){
super(l,b);
}

int p = 2 * (length + breadth);
int display(){
return p;
}
}

class Q24{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter length: ");
int l = sc.nextInt();
System.out.print("Enter breadth: ");
int b = sc.nextInt();

Area ar = new Area(l,b);
Perimeter pr = new Perimeter(l,b);
System.out.println();
System.out.println("Area of rectangle: "+ar.display());
System.out.println("Perimeter of rectangle: "+pr.display());
}
}