/*Problem Statement:
Design a Java program to model a University system. The outer class should be University,
 and it should contain a non-static nested class called Department. Each department should have a name, a head of department, and a list of courses offered.
Additionally, create a static nested class called UniversityStats that provides utility methods like counting the total number of departments 
and listing all department names.
Requirements:
Outer Class: University
Fields: universityName, location
Method: addDepartment(String name, String head, List<String> courses)
Method: displayDepartments()
Inner Class: Department (non-static)
Fields: name, head, courses
Method: displayInfo()
Static Nested Class: UniversityStats
Method: getDepartmentCount(List<Department>)
Method: listDepartmentNames(List<Department>)
Expected Output Example:
University Name: TechVille University
Location: Pune

Departments:
- Computer Science (Head: Dr. Mehta)
  Courses: Data Structures, Algorithms, AI

- Mechanical Engineering (Head: Dr. Rao)
  Courses: Thermodynamics, Fluid Mechanics
*/
 
 import java.util.Scanner;

class University{
Scanner sc = new Scanner(System.in);
static int n;
String name;
String head;
String courses[] = new String[2];
 
    class Department{
        String dname;
        String hod;
        String courses[] = new String[2];
        
        Department(){}
        Department(String name, String head,String courses[]){
           this.dname = name;
           this.hod = head;
           this.courses = courses;
        }
          
        void displayInfo(int k){
        System.out.println("====Department "+(k+1)+" Details=========");
        System.out.println("Department name : "+dname);
        System.out.println("Head            : "+hod);
        for(int i=0;i<courses.length;i++){
        System.out.println("Courses "+(i+1)+" name : "+courses[i]);
        }
        }

    }

    static class UniversityStats{
     static int dcount = n ;
     static String dnames;
       
     University u = new University();
     Department d = u.new Department();

     static int getDepartmentCount(){
     return dcount;
     }

     void DepartmentNames(){
        for(int i=0;i<2;i++){
            System.out.println("Department "+(i+1)+" Name : "+u.dobj[i].dname); 
        }
     }
         
    }

    Department dobj[] = new Department[n];

    void addDepartment(){
        for(int i=0;i<dobj.length;i++){
        System.out.println("Enter "+(i+1)+" department details :- ");
        System.out.print("Enter department name: ");
        name = sc.nextLine();
        System.out.print("Enter head of department name: ");
        head = sc.nextLine();
        for(int j=0;j<courses.length;j++){
        System.out.print("Enter "+(j+1)+" course name: ");
        courses[j] = sc.nextLine();
        }

        dobj[i] = new Department(name,head,courses);
        System.out.println();
        }
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter university name: ");
        String universityName = sc.nextLine();
        System.out.print("Enter university location: ");
        String location = sc.nextLine();

        System.out.print("Enter number of derpatment: ");
        n = sc.nextInt();

        University uobj = new University();

        uobj.addDepartment();

        System.out.println("=============================================");
         
        
        System.out.println("Universitry name : "+universityName);
        System.out.println("Location         : "+location);
        System.out.println();
        System.out.println("Number of Departments : "+University.UniversityStats.getDepartmentCount());
        System.out.println();
        for(int i=0;i<n;i++){
            uobj.dobj[i].displayInfo(i);
            System.out.println();
        }

    
  
}
}