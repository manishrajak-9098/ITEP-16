import java.util.Scanner;

class Tile{
int edgelength;
int area;

Tile(int s){
edgelength = s;
sArea();
}

void sArea(){
area = edgelength * edgelength;
System.out.println("Area of Tile: "+area);
}
}

class Floor{
int l;
int b;
int farea;
double totaltile;
Tile t;

Floor(int l,int b){
this.l = l;
this.b = b;
fArea();
}

void fArea(){
farea = l * b;
System.out.println("Area of Floor: "+farea);
}


void totalTiles(Tile t){
this.t = t;
totaltile = farea/t.area;
System.out.print("Total Tile required: "+totaltile);


}
}

class Q38{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter tile length: ");
int s = sc.nextInt();

System.out.print("Enter floor length: ");
int l = sc.nextInt();

System.out.print("Enter floor breadth: ");
int b = sc.nextInt();


Tile tobj = new Tile(s);
Floor fobj = new Floor(l,b);

fobj.totalTiles(tobj);
}

}