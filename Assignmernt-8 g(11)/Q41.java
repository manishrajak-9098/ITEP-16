import java.util.Scanner;

class Faculty{
    Scanner sc = new Scanner(System.in);
    String facultyname;
    String department;
    int salary;

  }

 class FullTimeFaculty extends Faculty{
  int basic;
  int allowance;	

  void getData(){
  System.out.print("Enter faculty name: ");
  facultyname = sc.nextLine();
  System.out.print("Enter department: ");
  department = sc.nextLine();
  System.out.print("Enter basic: ");
  basic = sc.nextInt();
  System.out.print("Enter allowance: ");
  allowance = sc.nextInt();
  salary = basic + allowance;
 }

  void display(){
  System.out.println("=======Full Time Faculty Details========");
  System.out.println("Faculty Name : "+facultyname);
  System.out.println("Department   : "+department);
  System.out.println("Salary       : "+salary);

}

}

  class PartTimeFaculty extends Faculty{
  int hour;
  int rate;

  void getData(){
  System.out.print("Enter faculty name: ");
  facultyname = sc.nextLine();
  System.out.print("Enter department: ");
  department = sc.nextLine();
  System.out.print("Enter Hour: ");
  hour = sc.nextInt();
  System.out.print("Enter Rate: ");
  rate = sc.nextInt();
  salary = hour * rate;
  }

void display(){
System.out.println("=======Part Time Faculty Details========");
System.out.println("Faculty Name : "+facultyname);
System.out.println("Department   : "+department);
System.out.println("Salary       : "+salary);

}

}

class Q41{
public static void main(String args[]){

FullTimeFaculty ft = new FullTimeFaculty();
PartTimeFaculty pt = new PartTimeFaculty();

System.out.println("Enter Full Time Faculty Details:- ");
ft.getData();
System.out.println();
System.out.println("Enter Part Time Faculty Details:- ");
pt.getData();
System.out.println();

ft.display();
System.out.println();
pt.display();
}

}