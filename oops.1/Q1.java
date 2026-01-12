
// Employee Record System
// Create a class Employee with private fields: id, name, and salary.
// Use setter methods to assign values. Add a method to display employee details.

class Employee{
    private int id;
    private String name;
    private float salary;

    public void setdata(int id, String name, float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public void  employeedetail(){
        System.out.println("Id  : "+this.id);
        System.out.println("Name  : "+this.name);
        System.out.println("salary  : "+this.salary);

    }
}
class Q1{
    public static void main (String args[]){
        Employee em = new Employee();
        em.setdata(1007,"mani",750000f);
        em.employeedetail();
    }
}