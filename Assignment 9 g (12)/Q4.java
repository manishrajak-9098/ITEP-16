/*4. Smart Home Simulation
Design a class SmartHome with a non-static inner class Device. Each device should have a name, 
type (e.g., light, thermostat), and status (on/off). The outer class should:
•	Add and remove devices
•	Toggle device status
•	Display all devices
Include a static nested class DeviceUtils to:
•	Count active devices
•	Group devices by type */


class SmartHome  {
 int count=0;
 void addDevice(String name , String type , String status , SmartHome.Device d[]){
   d[count]=new Device(name , type ,status);
   count++;
 }
 void  ToggleDevice(String name , SmartHome.Device d[]  ){
 for(int i=0;i<=count;i++){
    if(name.equalsIgnoreCase(d[i].name)){
    if(d[i].status.equalsIgnoreCase("off")) d[i].status="On";
    else  d[i].status="Off";
    break;
    }
 }

 }
 void Display(SmartHome.Device d []){
  for(int i =0;i<count;i++){
    System.out.println("=================================");
    System.out.println("Device Name : "+d[i].name);
    System.out.println("Device Status : "+d[i].status);
    System.out.println("Device Type : "+d[i].type);
  }
 }
 class Device {
    String name ;
    String type ;
    String status;
    Device(String name , String type , String status){
        this.name = name;
        this.type =type ;
        this.status=status;
    }
 }

class DeviceUtils{
   int  total_Active=0;
   void activeDevices(SmartHome.Device d[]){
 for(int i=0;i<count;i++){
    if(d[i].status.equalsIgnoreCase("on")) total_Active++ ;
   }
   System.out.println("Active Devices "+total_Active);
   }
}

}


public class Q4{
public static void main(String []args){
SmartHome s1= new SmartHome();
SmartHome.Device []d = new SmartHome.Device[10];
s1.addDevice("Laptop","light","on",d);
s1.addDevice("Mobile","light","off",d);
s1.addDevice("Laptop","thermostat","on",d);
s1.Display(d);
s1.ToggleDevice("Mobile",d);
s1.Display(d);
SmartHome.DeviceUtils d1 = s1.new DeviceUtils();
d1.activeDevices(d);
}
}