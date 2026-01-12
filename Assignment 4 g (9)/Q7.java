// 7) WAP to enter source, destination,date, day and time and creates a menu for reservation
//  where user needs to select vehicle type then selects no. Of seats for males, females and children and
//   also calculate the fare according to senior citizen criteria. 
//   Note : No bookings will be considered for Saturday and Sunday 
import java.util.Scanner;

class Passenger{
int m,f,c,o;

void Detail(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of male passengers: ");
m = sc.nextInt();
System.out.print("Enter number of female passengers: ");
f = sc.nextInt();
System.out.print("Enter number of child passengers: ");
c = sc.nextInt();
System.out.print("Enter number of old aged passengers: ");
o = sc.nextInt();
}



}
class Q7{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

System.out.println("Train journey... ");
System.out.print("Enter staring point: ");
String st = sc.nextLine();
System.out.print("Enter Destination: ");
String destination = sc.nextLine();
System.out.print("Enter Day: ");
String day = sc.nextLine();
System.out.print("Enter Date: ");
int date = sc.nextInt();

String d = day.toLowerCase();

if(d==("sunday") || d==("saturday")){
System.out.print("Not considered");
}
else{
System.out.println("Select vehicle type(1-3): ");
System.out.println("1. Train: ");
System.out.println("2. Bus: ");
System.out.println("3. Flight: ");
int mode = sc.nextInt();

Passenger obj = new Passenger();


switch(mode){

case 1:
         System.out.println();
         System.out.println("Passengers details for travelling in train: ");
         obj.Detail();
         System.out.println();
         System.out.print("Enter fair for one passenger: ");
         int trainf = sc.nextInt();
         System.out.println();
         int mTrainAmt = trainf * obj.m;
         int fTrainAmt = trainf * obj.f;
         int cTrainAmt = trainf * obj.c;
         double oTrainAmt = (trainf * obj.o)/2; 
         System.out.print("Toal fair with (senior citizen criteria): "+(mTrainAmt + fTrainAmt + cTrainAmt + oTrainAmt)); 
break;

case 2:
         System.out.println();
         System.out.println("Passengers details for travelling in bus: ");
         obj.Detail();
         System.out.println();
         System.out.print("Enter fair for one passenger: ");
         int busf = sc.nextInt();
         System.out.println();
         int mbusAmt = busf * obj.m;
         int fbusAmt = busf * obj.f;
         int cbusAmt = busf * obj.c;
         double obusAmt = (busf * obj.o)/2; 
         System.out.print("Toal fair with (senior citizen criteria): "+(mbusAmt + fbusAmt + cbusAmt + obusAmt)); 
break;

case 3:
        System.out.println();
        System.out.println("Passengers details for travelling in flight: ");
        obj.Detail();
        System.out.println();
        System.out.print("Enter fair for one passenger: ");
        int flightf = sc.nextInt();
        System.out.println();
        int mflightAmt = flightf * obj.m;         
        int fflightAmt = flightf * obj.f;
        int cflightAmt = flightf * obj.c;
        double oflightAmt = (flightf * obj.o)/2; 
        System.out.print("Toal fair with (senior citizen criteria): "+(mflightAmt + fflightAmt + cflightAmt + oflightAmt)); 
break;

default : System.out.print("Invalid Input");
        }
    }

  }
}
