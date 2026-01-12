
import java.util.Scanner;
class Student{
    String subject;
    float out_of_th;
    float obtained_theroy;
    String practical_sub;
    float out_of_pc;
    float obtained_pc;
     static final String RESET = "\u001B[0m";
     static final String BLACK_TEXT = "\u001B[30m";
     static final String WHITE_BACKGROUND = "\u001B[47m";


    // String remark;
    // String grade;
    Student(float out_of_th , float out_of_pc){
        this.out_of_th = out_of_th;
        this.out_of_pc = out_of_pc;
        // this.remark = remark;
        // this.grade = grade;
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

    void subdisplay(){
      System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| "+subject +"\t\t\t"+ "|\t\t"+obtained_theroy+"\t\t|\t\t "+out_of_th+"\t\t|                   ");
    }



    void getPracticleData(){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter practicle  Name ");
         practical_sub = sc.nextLine();

         System.out.println("Enter Marks obtained in  Practical out of : "+out_of_pc);
          obtained_pc = sc.nextFloat();
      
        if (obtained_pc > out_of_pc || obtained_pc < 0) {

        System.out.println(" Invalid marks! Please re-enter.");

        System.out.print("Enter Marks obtained in Practical out of " + out_of_pc + ": ");
            obtained_pc = sc.nextFloat();
    }
    }
     void pc_display(){
      System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| "+practical_sub +"\t\t\t"+ "|\t\t"+obtained_pc+"\t\t|\t\t "+out_of_pc+"\t\t|");
    
      }

}

class Marksheets{
    public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    // Color Codes
      String RESET = "\u001B[0m";
      String BLACK_TEXT = "\u001B[30m";
      String WHITE_BACKGROUND =  "\u001B[47m";

    float out_of_th = 100f;
    float out_of_pc = 25f;
    String remark;
    String grade;   

    Student s = new Student(out_of_th, out_of_pc );

    System.out.println("Enter Your Name");
    String student_name = sc.nextLine();
    //  sc.nextLine();
    System.out.println("Enter Your Father Name");
    String father_name = sc.nextLine();
    System.out.println("Enter Your Mothers Name");
    String Mother_name = sc.nextLine();
    System.out.println("Enter your Roll No ");
    int rollNO = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your Enrollment /Registtration No ");
    String enrollNO = sc.nextLine();
    System.out.println("Enter type your Education private /Regular  ");
    String type_p_r = sc.nextLine();
    System.out.println("Enter Subjects");
   

    

    Student st[] = new Student[5];
    
    for(int i=0; i<st.length; i++){
        st[i] = new Student(out_of_th, out_of_pc   ); //
        st[i].getData();
    }

    System.out.println("Enter practicle Subject Name");
   
    Student arr[] = new Student[2];
     for(int i=0; i<arr.length; i++){
        arr[i] = new Student(out_of_th, out_of_pc );
        arr[i].getPracticleData();
    }

    int failCount = 0; 
    float theoryTotal = 0f; 

for (int i = 0; i <st.length; i++) {
    theoryTotal =theoryTotal+ st[i].obtained_theroy;
    

    if (st[i].obtained_theroy < 33) {
        failCount++;
    }
}
    float practicalTotal = 0f;

    for(int i=0; i<arr.length; i++){
        practicalTotal = practicalTotal +arr[i].obtained_pc;
    }

    float grandTotal = theoryTotal+practicalTotal;
    float total_Sub_prac = (st.length*out_of_th)+(arr.length*out_of_pc);
   float percentage = (grandTotal/total_Sub_prac)*100f;

    // o	If the count is ≥ 3, remark = Year Back
    if (failCount>=3){
        remark = "Year Back !";
    }
    // o	Else if the count is > 0 and < 3, remark = ATKT
    else if(failCount>0 && failCount < 3){
        remark = "You got ATKT !";
    }
    else{
        remark = " PASS";

    }

    //  o	A+ (≥90), A (80–89), B+ (70–79), B (60–69), C (50–59), D (40–33), F (<33)
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

	// A table for theory and practical marks (Name, Out Of, Obtained)


    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "...........................................................................................................");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "                                                                                        ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t\t\t\t\tMARKSHEET                                                                   ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "                                                                                     ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t\t\tMAHARISHI   MAHESH   YOGI   VEDIC   VISHWAVIDYALAYA                              ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "                                                                                     ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t\t(Established by M.P. Act No.37 of 1995, UGC  under section 2-f)                      ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "                                                                                     ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t\t\t\t\tGRADE SHEET                                                                    ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "...........................................................................................................");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t\tBachclor of Science First Semester Examination August 2025-26                        ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "                                                                                     ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\tRoll No                 "+"\t"+rollNO+"\t\t\t\t"+type_p_r+"                            ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\tEnroll No               "+"\t"+enrollNO+"                                            ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\tName of Candidate       "+"\t"+student_name+"                                        ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\tFather's/ Husband's Name"+"\t"+father_name+"                                         ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\tMother's/ Wife's Name   "+"\t"+Mother_name+"                                         ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "...........................................................................................................\n");

    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| Subject Name\t\t"+"|\t\tObtained marks \t|\t\t" + "Out of\t\t|                                 \n");
    for(Student element : st){
            element.subdisplay();
    }
    for(Student ele : arr){
        ele.pc_display();
    }
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "..............................................................................................................");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| Total Marks\t\t  :"+"|\t\t"+grandTotal+"\t\t|\t\t550\t\t|                                        ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| Percentage\t\t   :"+"\t"+percentage                                                );
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| Grade       \t\t :"+"\t"+grade+"                                                     ");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "\t\t| Remark       \t\t:"+"\t"+remark+"                                                   \n");
    System.out.println(WHITE_BACKGROUND + BLACK_TEXT + "..............................................................................................................");
    

  }
}