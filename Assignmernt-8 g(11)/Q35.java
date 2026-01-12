/*
 * 35. Create a class Employee with(empNo ,salary and totalSalary) ) with following features.
a. Only parameterized constructor;
b. totalSalary always represent total of all the salaries of all employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using class method.

 */
class Employee{
    static int empNo;
    int salary;
   static int totalSalary;
    static int Totalemp=0;
    Employee(int empNo , int salary ){
        Totalemp++;
        this.empNo=Totalemp;
        this.salary=salary;
        totalSalary+=salary;
    }
  void display(){
    System.out.println("Employee number : "+empNo+" Total Salary : "+totalSalary+" Emp no :"+empNo);
  }

}
public class Q35 {
    public static void main(String[] args) {
    Employee e = new Employee(25, 1434);
    Employee e1 = new Employee(25, 2000);
    Employee e2 = new Employee(25, 3000);
     e2.display();
        
    }
    
        
}
 