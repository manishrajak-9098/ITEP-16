//   Q1. Hospital Management System (Array of Objects)
// Create a program to manage a hospital using Object-Oriented Programming concepts.
// Requirements:
// 1.	Create at least three modules:
// o	Patient
// o	Doctor
// o	Medicine
// 2.	Each module should be represented as a class with attributes and methods. Example:
// o	Patient: id, name, age, disease
// o	Doctor: id, name, specialization
// o	Medicine: id, name, price
// 3.	Use an array of objects for storing multiple Patients, Doctors, and Medicines.
// 4.	Implement methods to:
// o	Add new entries
// o	Display all entries
// o	Search by ID or Name
// 5.	Write a main class (HospitalManagement) that provides a menu-driven program to interact with all modules.

import java.util.Scanner;

// ================= Patient Class =================
class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

// ================= Doctor Class =================
class Doctor {
    int id;
    String name;
    String specialization;

    Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}

// ================= Medicine Class =================
class Medicine {
    int id;
    String name;
    double price;

    Medicine(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine ID: " + id + ", Name: " + name + ", Price: Rs." + price);
    }
}

// ================= Main Class =================
public class Hospital {
    static Scanner sc = new Scanner(System.in);

    // Arrays of objects
    static Patient[] patients = new Patient[50];
    static Doctor[] doctors = new Doctor[20];
    static Medicine[] medicines = new Medicine[50];

    // Counters
    static int patientCount = 0;
    static int doctorCount = 0;
    static int medicineCount = 0;

    // ---------------- Methods ----------------

    // Add new Patient
    public static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients[patientCount++] = new Patient(id, name, age, disease);
        System.out.println("Patient added successfully!\n");
    }

    // Add new Doctor
    public static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Doctor Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        doctors[doctorCount++] = new Doctor(id, name, specialization);
        System.out.println(" Doctor added successfully!\n");
    }

    // Add new Medicine
    public static void addMedicine() {
        System.out.print("Enter Medicine ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        medicines[medicineCount++] = new Medicine(id, name, price);
        System.out.println(" Medicine added successfully!\n");
    }

    // Display Patients
    public static void displayPatients() {
        if (patientCount == 0) {
            System.out.println(" No Patients found!\n");
            return;
        }
        System.out.println("===== Patient List =====");
        for (int i = 0; i < patientCount; i++) {
            patients[i].display();
        }
        System.out.println();
    }

    // Display Doctors
    public static void displayDoctors() {
        if (doctorCount == 0) {
            System.out.println("⚠ No Doctors found!\n");
            return;
        }
        System.out.println("===== Doctor List =====");
        for (int i = 0; i < doctorCount; i++) {
            doctors[i].display();
        }
        System.out.println();
    }

    // Display Medicines
    public static void displayMedicines() {
        if (medicineCount == 0) {
            System.out.println("⚠ No Medicines found!\n");
            return;
        }
        System.out.println("===== Medicine List =====");
        for (int i = 0; i < medicineCount; i++) {
            medicines[i].display();
        }
        System.out.println();
    }

    // Search Patient by ID
    public static void searchPatient() {
        System.out.print("Enter Patient ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].id == id) {
                patients[i].display();
                return;
            }
        }
        System.out.println("⚠ Patient not found!\n");
    }

    // Search Doctor by Name
    public static void searchDoctor() {
        System.out.print("Enter Doctor Name to search: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].name.equalsIgnoreCase(name)) {
                doctors[i].display();
                return;
            }
        }
        System.out.println("⚠ Doctor not found!\n");
    }

    // Search Medicine by ID
    public static void searchMedicine() {
        System.out.print("Enter Medicine ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].id == id) {
                medicines[i].display();
                return;
            }
        }
        System.out.println("⚠ Medicine not found!\n");
    }

    // ---------------- Main Menu ----------------
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Medicine");
            System.out.println("4. Display Patients");
            System.out.println("5. Display Doctors");
            System.out.println("6. Display Medicines");
            System.out.println("7. Search Patient by ID");
            System.out.println("8. Search Doctor by Name");
            System.out.println("9. Search Medicine by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 : addPatient(); break;
                case 2 : addDoctor(); break;
                case 3 : addMedicine(); break;
                case 4 : displayPatients(); break;
                case 5 : displayDoctors(); break;
                case 6 : displayMedicines(); break;
                case 7 : searchPatient(); break;
                case 8 : searchDoctor(); break;
                case 9 : searchMedicine(); break;
                case 0 : System.out.println(" Exiting... Thank you!"); break;
                default : System.out.println(" Invalid choice! Try again."); break;
            }
        } while (choice != 0);
    }
}

























































































// import java.util.Scanner;
// class Patient{
//   int id;
//   String name;
//   int age;
//   String disease;
   
//    void getdataPt(){

//     System.out.println(" Enter name of patient ");
//      name = sc.nextLine();

//     System.out.println(" Enter id of patient ");
//     id = sc.nextInt();

//     System.out.println(" Enter age of patient ");
//     age = sc.nextInt();
//     sc.nextLine();
//     System.out.println(" Enter disease of patient ");
//      disease = sc.nextLine();

//    }
   

// }
// class Doctor{
//   int id;
//   String name;
//   String specialization;
  
//   void getdataDr(){
//     System.out.println("Enter name of doctor ");
//     name = sc.nextLine();
//     System.out.println("Enter id of doctor ");
//     id = sc.nextInt();
//      sc.nextLine();
//     System.out.println("Enter Specialization of doctor ");
//     specialization = sc.nextLine();

//   }
// }

// class Medicine{
//   int id ;
//   String name;
//   double price;

// void getdataMd(){
//     System.out.println("Enter a name of medicine");
//     name =sc.nextLine();

//     System.out.println("Enter a id of medicine");
//     id = sc.nextInt();

//     System.out.println("Enter a price of medicine");
//     price = sc.nextDouble();

// }

// }
// class HospitalManagement{
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter no. of patient ");
//     int n1 = sc.nextInt();
//     Patient pt = new Patient[n];

//     for(int i =0; i<n1; i++){
//       pt[i] = new Patient();
//       pt[i].getdataPt();
//     }

//     System.out.println("Enter no. of Doctors ");
//     int n2 = sc.nextInt();
//     Doctor dr = new Doctor[n2];

//     for(int i=0; i<n2; i++){

//     dr[i] = new Doctor();
//     dr[i].getdataDr();
//     }

//     System.out.println("Enter no. of medicine ");
//     int n3 = sc.nextInt();
//     Medicine md = new Medicine[n3];

//     for(int i =0; i<n3; i++){
//       md[i] = new Medicine();
//       md[i].getdataMd();

//     }



// }