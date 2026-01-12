import java.util.Scanner;

abstract class Processor{
int data;
void showData(){
System.out.println("Data: "+data);
}

abstract void process();

}


class Factorial extends Processor{
Factorial(int n){
data = n;
}
void process(){
int p=1;
for(int i=data;i>0;i--){
p = p * i;
}
System.out.println("Factorial: "+p);
}
}

class Circle extends Processor{
Circle(int r){
data = r;
}

void process(){
double area = Math.PI * data * data;
System.out.println("Area of circle: "+area);
}


}

class Q43{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Processor obj;
obj = new Factorial(n);
obj.showData();
obj.process();
obj = new Circle(n);
obj.process();
}
}