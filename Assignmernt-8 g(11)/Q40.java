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
this();
this.roomArea = ra;
this.hallArea = ha;
this.price = p;
}

void show(){
System.out.println("Room Area : "+roomArea);
System.out.println("Hall Area : "+hallArea);
System.out.println("Price     : "+price);
}

}


class TwoBHK extends OneBHK{
int room2area;

TwoBHK(){
room2area = 0;
}

TwoBHK(int ra1,int ra2,int ha,int p){
super(ra1,ha,p);
this.room2area = ra2;
this.show();
}

void show(){
super.show();
System.out.println("Room 2 Area : "+room2area);
}


}

class Q40{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter room area: ");
int ra1 = sc.nextInt();
System.out.print("Enter room 2 area: ");
int ra2 = sc.nextInt();
System.out.print("Enter hall area: ");
int ha = sc.nextInt();
System.out.print("Enter price: ");
int p = sc.nextInt();

TwoBHK tobj = new TwoBHK(ra1,ra2,ha,p);

}

}