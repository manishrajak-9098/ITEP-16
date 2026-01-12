// 10) WAP to manage complete student report



import java.util.Scanner;
class Student{
    String subject;
    float out_of_th;
    float obtained_theroy;
    

  
    Student(float out_of_th ){
        this.out_of_th = out_of_th;
    
    
    }
    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject theory Name ");
        subject = sc.nextLine();
       
        System.out.println("Enter Marks obtained in theory Subject out of : "+out_of_th);
         obtained_theroy = sc.nextFloat();
      
            
        if (obtained_theroy > out_of_th || obtained_theroy < 0) {

        System.out.println(" Invalid marks! Please re-enter.");

        System.out.print("Enter Marks obtained in theory Subject out of " + out_of_th + ": ");
            obtained_theroy = sc.nextFloat();
    }
    }



  
    }


class Q10{
    public static void main(String...args){
    Scanner sc = new Scanner(System.in);
   

    float out_of_th = 100f;
    String remark;
    String grade;   

    Student s = new Student(out_of_th );

    System.out.println("Enter Your Name");
    String student_name = sc.nextLine();
    System.out.println("Enter Your Father Name");
    String father_name = sc.nextLine();
    System.out.println("Enter Your Mothers Name");
    String Mother_name = sc.nextLine();
    System.out.println("Enter your Roll No ");
    int rollNO = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your class  ");
    String className = sc.nextLine();
  
    System.out.println("Enter 5 Subjects");
   
    Student st[] = new Student[5];
    
    for(int i=0; i<st.length; i++){
        st[i] = new Student(out_of_th ); 
        st[i].getData();
    }

   
    int count = 0; 
    float theoryTotal = 0f; 

for (int i = 0; i <st.length; i++) {
    theoryTotal =theoryTotal+ st[i].obtained_theroy;
    

    if (st[i].obtained_theroy < 33) {
        count++;
    }
}


    float grandTotal = theoryTotal;
    float total_Sub_prac = (st.length*out_of_th);
   float percentage = (grandTotal/total_Sub_prac)*100f;

    if (count>=3){
        remark = "Year Back !";
    }
    else if(count>0 && count < 3){
        remark = "You got Suplimentry !";
    }
    else{
        remark = " PASS";

    }

    if (percentage>=90){
        grade = " Grade A+ ";

    }
    else if (percentage>=80 && percentage<90){
        grade  = " Grade A ";
    }
    else if (percentage>=70 && percentage<80){
        grade = " Grade B+ ";
    }
    else if (percentage>=60 && percentage<70){
        grade = " Grade B ";
    }
    else if (percentage>=50 && percentage<60){
        grade = " Grade C ";
    }
    else if (percentage>=33 && percentage<=40){
        grade = " Grade D ";
    }
    else {
        grade = " FAIL ";

    }

    System.out.println(" Student Name : "+student_name);
    System.out.println(" Father Name : "+father_name);
    System.out.println(" Mother Name : "+Mother_name);
    System.out.println(" class name : "+className);
    System.out.println(" roll No : "+rollNO);
    for(Student element : st){
    System.out.println("Subject :    "+element.subject + "        obtained marks :    "+element.obtained_theroy+ "       out of :     "+element.out_of_th);
    System.out.println("Percentage : "+percentage);
    System.out.println(" Grade : "+grade);
    }

  }
}