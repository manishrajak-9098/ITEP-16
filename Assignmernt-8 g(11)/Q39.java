import java.util.Scanner;

class OneBHK{

int roomArea;
int hallArea;
int price;

OneBHK(){
this.roomArea = 0;
this.hallArea = 0;
this.price = 0;
     }

OneBHK(int ra,int ha,int p){


  this.roomArea = ra;
  this.hallArea = ha;
  this.price = p;
  show();
  }

void show(){
System.out.println("Room Area : "+roomArea);
System.out.println("Hall Area : "+hallArea);
System.out.println("Price     : "+price);
}

}


class Q39{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter room area: ");
int ra = sc.nextInt();
System.out.print("Enter hall area: ");
int ha = sc.nextInt();
System.out.print("Enter price: ");
int p = sc.nextInt();

OneBHK obj = new OneBHK(ra,ha,p);



}

}