import java.util.Scanner;

class Alpha{
int a;
Alpha(int a){
this.a = a;
}
}

class Beta{
int b;
Beta(int b){
this.b = b;
}

} 

class Q21{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter integer for Alpha: ");
int a = sc.nextInt();
System.out.print("Enter integer for Beta: ");
int b = sc.nextInt();

Alpha obj1 = new Alpha(a);
Beta obj2 = new Beta(b);

System.out.println();
if(obj1.a > obj2.b){
System.out.println("Alpha class data member "+obj1.a+" is greater.");
}
else if(obj2.b > obj1.a){
System.out.println("Beta class data member "+obj2.b+" is greater.");
}
else{
System.out.println("Both class data member are equal.");
}



}

}