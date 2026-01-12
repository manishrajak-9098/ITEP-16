

import java.util.Scanner;

class Student{
String name;
int rollno,age,score;

Student(String name,int rollno,int age,int score){
this.name = name;
this.rollno = rollno;
this.age = age;
this.score = score;
}


void showStudent(){
System.out.println(rollno +"\t\t"+name+"\t\t"+age+"\t\t\t"+score);
}


}

class Q37{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

Student stArr[] = new Student[10];

for(int i=0;i<10;i++){
System.out.println();
System.out.println("Enter "+(i+1)+" Students details:-  ");
System.out.print("Enter name: ");
String name = sc.nextLine();
System.out.print("Enter roll number: ");
int rollno = sc.nextInt();
System.out.print("Enter age: ");
int age = sc.nextInt();
System.out.print("Enter score: ");
int score = sc.nextInt();
sc.nextLine();


stArr[i] = new Student(name,rollno,age,score);
}


System.out.println("========================Student Details==========================");

System.out.println();
System.out.println("=====================Student Score[0 - 50]=======================");
System.out.println("Roll No. \tName \t\tAge \t\t\tScore");
for(int i=0;i<10;i++){
if(stArr[i].score < 50){
stArr[i].showStudent();
}
}


System.out.println();
System.out.println("=====================Student Score[50 - 65]=======================");
System.out.println("Roll No. \tName \t\tAge \t\t\tScore");
for(int i=0;i<10;i++){
if(stArr[i].score >= 50 && stArr[i].score  < 65 ){
stArr[i].showStudent();
}
}


System.out.println();
System.out.println("=====================Student Score[65 - 80]=======================");
System.out.println("Roll No. \tName \t\tAge \t\t\tScore");
for(int i=0;i<10;i++){
if(stArr[i].score >= 65 && stArr[i].score < 80){
stArr[i].showStudent();
}
}

System.out.println();
System.out.println("=====================Student Score[80 - 100]=======================");
System.out.println("Roll No. \tName \t\tAge \t\t\tScore");
for(int i=0;i<10;i++){
if(stArr[i].score >= 80 && stArr[i].score <= 100){
stArr[i].showStudent();
}
}








}
}