
/* 3. Employee Management System
Create a class Company that contains a non-static nested class Employee. Each Employee should have fields like name, id, and designation.
 The Company class should maintain a list of employees and provide methods to:
•	Add a new employee
•	Display all employees
•	Search for an employee by ID
Add a static nested class CompanyPolicy that contains static methods to:
•	Validate employee designation
•	Enforce minimum working hours
*/
class Company{
    int count = 0;
    void addnewEmployee(String name, String id, String designation, Company.Employee em[]){
        em[count] = new Employee(name, id, designation );
        count++;
    }


    class Employee{
        String name;
        String id;
        String designation;

        Employee(String name, String id, String designation){
            this.name = name;
            this.id = id;
            this.designation = designation;
        }
        }
        // static class CompanyPolicy{
        
        // }

 void display(Company.Employee em[]){
            for(int i = 0; i<count; i++){
                System.out.println("Name        : "+em[i].name);
                System.out.println("Id          : "+em[i].id);
                System.out.println("Designation : "+em[i].designation);
            }
 }
       void searchId(String id,Employee em[]){
        Boolean b=false;
     for(int i =0;i<count;i++){
        if(id.equals(em[i].id)){
            b=true;
        System.out.println();
        System.out.println("Employee Name is : "+em[i].name);
    break;    
    }
     }
     if(b==false){
        System.out.println("Employee Id not Found");
       }
    }
  }


public class Q3{
    public static void main(String...args){
        Company c = new Company();
        Company.Employee [] em = new Company.Employee[5];

        c.addnewEmployee("Manish", "101", "ceo",em);
        c.addnewEmployee("Harry porter", "102", "manager",em);
        c.addnewEmployee("Hitesh", "103", "Tech Manager",em);
        c.addnewEmployee("Mani", "104", "Chairman",em);
        c.addnewEmployee("Harry", "105", "Developer",em);
        c.display(em);
        c.searchId("104", em);
        


    }
}