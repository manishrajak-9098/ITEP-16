// 3. Write a program to copy content of one file into another file.
import java.io.*;
import java.util.*;
class Q3{
    public static void main(String[]args){
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
        FileReader fr = new FileReader("C:\\MPIF-itep java assignment 1\\Assignment - 10g\\myfolder\\file.txt");

          File file2 = new File("C:\\MPIF-itep java assignment 1\\Assignment - 10g\\myfolder\\file2.txt");
              if(!file2.exists()){
                    file2.createNewFile();
                      System.out.println("Folder created successfully");
                 }else{
                      System.out.println("Folder Already exist");         
                 }
        FileWriter fw = new FileWriter(file2);
        
        while (true) {
                int ch = fr.read();
                if (ch == -1) {
                    break;
                }
                fw.write(ch);
            }
            fr.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Exception : "+e);

        }
    }
}