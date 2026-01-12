// 4.Write a program to define a class Student with the following specification
// Private members of class student
// admno	integer
// sname	string 
// eng, math, science		float
// total	float
// ctotal() (a Function to calculate eng + math + science with float return type.)

// Public member function of class student
// takeData() (a Function to accept values for admno, sname, eng, science and invoke ctotal() to calculate total.)
// showData() (a Function to display all the data members on the screen.)

import java.util.Scanner;

class Student{
  private  int adm_no;
  private  String sName;
   private float math;
   private float science;
   private float eng;
    private float total;

    void takeData(String sName, int adm_no, float math, float science, float eng){
        this.sName = sName;
        this.adm_no = adm_no;
        this.math = math;
        this.science = science;
        this.eng = eng;

        cTotal();

    }
    float cTotal(){
         total = math+science+eng;
         return  total;
    }
    void showData(){
        System.out.println("Student  Name :"+sName);
        System.out.println("Adm No :"+adm_no);
        System.out.println("Total mark :"+total);
        // System.out.println("Student  Name :"+sName);
        // System.out.println("Student  Name :"+sName);
    }

}

class Q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of Student ");
        String sName = sc.nextLine();

        System.out.println("Enter Adm no of Student ");
        int adm_no = sc.nextInt();

        System.out.println("Enter Maths marks ");
        float math = sc.nextFloat();
        
        System.out.println("Enter Science marks ");
        float science = sc.nextFloat();

        System.out.println("Enter Adm no of Student ");
        float eng = sc.nextFloat();

        Student obj = new Student();
        obj.takeData(sName , adm_no, math, science, eng);
        obj.showData();
    }
}