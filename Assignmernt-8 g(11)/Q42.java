import java.util.Scanner;
class Student{
    int rollno;
    double percentage;
    Student(){
        this.rollno = 01;
        this.percentage = 67.87;
    }
    Student(int rollno,double percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        System.out.println("Roll no : "+rollno);
        System.out.println("Percentage : "+percentage);
    }
}
class CollegeStudent extends Student{
    int semester;
    CollegeStudent(){
        this.semester = 1;
    }
    CollegeStudent(int rno,double per,int sem){
        super(rno,per);
        this.semester = sem;
    }
    @Override
    void show(){
        System.out.println("\n======= College Student Data =======");
        System.out.println("Roll no : "+rollno);
        System.out.println("Percentage : "+percentage);
        System.out.println("Semester : "+semester);
    }
    void data(){
        System.out.println("\n======College Student=======");
    }
}

class SchoolStudent extends Student{
    String className;
    SchoolStudent(){
        this.className = "12th";
    }

    SchoolStudent(int rno,double per,String cname){
        super(rno,per);
        this.className = cname;
    }
    @Override
    void show(){
        System.out.println("\n======= School Student Data =======");
        System.out.println("Roll no : "+rollno);
        System.out.println("Percentage : "+percentage);
        System.out.println("Class Name : "+className);
    }
    void data(){
        System.out.println("\n======School Student=======");
    }
}
class Q42{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[5];

        for(int i=0; i<2; i++){
            System.out.println("\nEnter data of College student "+(i+1));
            System.out.println("Enter roll no ");
            int rno = sc.nextInt();
            System.out.println("Enter percentage ");
            double per = sc.nextDouble();
            System.out.println("Enter Semenster");
            int sem = sc.nextInt();
            s[i] = new CollegeStudent(rno,per,sem);
        }

        for(int i=2; i<5; i++){
            System.out.println("\nEnter data of School student "+(i-1));
            System.out.println("Enter roll no ");
            int rno = sc.nextInt();
            System.out.println("Enter percentage ");
            double per = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter class name");
            String cname = sc.nextLine();
            s[i] = new SchoolStudent(rno,per,cname);
        }

        for(int i=0; i<5; i++){
            s[i].show();
        }

        System.out.println("\nEnter roll no to search record");
        int search = sc.nextInt();
        int flag = 0;
        for(int i=0; i<5; i++){
            if(s[i].rollno == search){
                if(s[i] instanceof CollegeStudent){
                    ((CollegeStudent)s[i]).data();
                    flag = 1;
                    break;
                }
                else{
                    ((SchoolStudent)s[i]).data();
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0){
            System.out.println("\nRoll no is not correct ");
        }
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(s[i].percentage > 75){
                cnt++;
            }
        }
        System.out.println("\nTotal students having 75% above marks are "+cnt);
    }   
}