// 1. Write a program to count how many times character ‘t’ occurs in a file.

import java.io.*;
import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        try {      
            File file = new File("C:\\MPIF-itep java assignment 1\\Assignment - 10g\\myfolder\\file.txt");
                 if(!file.exists()){
                    file.createNewFile();
                      System.out.println("Folder created successfully");
                 }else{
                      System.out.println("Folder Already exist");         
                 }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content : ");
        String content = sc.nextLine();
  
        FileWriter f = new FileWriter(file);
        f.write(content);
        f.close();
        int count = 0;
        FileReader fr = new FileReader(file);
         while (true) {
         int x = fr.read();  
         if (x == -1) {       //  end of file 
         break;
     }
          if ((char)x == 't' || (char)x=='T')  {  
           count++;
        }
    }
      fr.close();  
     System.out.println("'t' occurs in file : " + count);
       } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

