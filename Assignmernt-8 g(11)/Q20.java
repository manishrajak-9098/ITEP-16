import java.util.Scanner;

class Distance{
int feet,inch;

void getData(int f,int i){
this.feet = f;
this.inch = i;
}
 
void display(){
System.out.println(feet+" feet "+inch+" inches");
}

Distance total(Distance obj2){
Distance sum = new Distance();
sum.inch = this.inch + obj2.inch;
sum.feet = this.feet + obj2.feet;

if(sum.inch > 12){
sum.inch = sum.inch%12;
sum.feet++;
}
return sum;
}
}

class Q20{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter 1 distance: ");
System.out.print("Enter feet: ");
int feet1 = sc.nextInt();
System.out.print("Enter inch: ");
int inch1 = sc.nextInt();

System.out.println();
System.out.println("Enter 2 distance: ");
System.out.print("Enter feet: ");
int feet2 = sc.nextInt();
System.out.print("Enter inch: ");
int inch2 = sc.nextInt();

Distance obj1 = new Distance();
Distance obj2 = new Distance();

obj1.getData(feet1,inch1);
obj2.getData(feet2,inch2);

System.out.println();
System.out.println("1 distance: ");
obj1.display();
System.out.println("2 distance: ");
obj2.display();

System.out.println();
Distance res = obj1.total(obj2);

System.out.print("Total distance: "+res.feet +" feet "+res.inch+" inches");

}
}