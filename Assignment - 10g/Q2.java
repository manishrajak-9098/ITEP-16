// 2. Write a program to count no of words in a text file and average word size.


import java.io.*;

class Q2 {
    public static void main(String args[]) {
        try 
            (FileReader fr = new FileReader("C:\\MPIF-itep java assignment 1\\Assignment - 10g\\myfolder\\file.txt");
            BufferedReader br = new BufferedReader(fr)){
            String line;
            int wordCount = 0;
            double totalChars = 0;

            while(true){
                line = br.readLine();
                if (line==null){
                    break;
                }
                String words[] = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                    for (String w : words) {
                        totalChars += w.length();
                    }
                }
            }
            System.out.println("Total words = " + wordCount);

            if (wordCount > 0) {
                double avgSize =  (totalChars / wordCount);
                System.out.println("Average word size = " + avgSize);
            } else {
                System.out.println("File is empty.");
            }

        }catch (IOException e) {
            System.out.println("Exception e : " + e);
        }
    }
}


