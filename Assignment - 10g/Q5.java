// 5. Write a program to count number of bytes in a image file(jpeg/png/gif).
//  Also find how much time it will take to upload the file on server if internet speed is 256 bps(bitsper second). 
import java.io.*;


class Q5 {
public static void main(String args[]){
int count =0;
double upload_time;
try{

FileInputStream f = new FileInputStream("radhe.jpeg");
int  b ;
while((b=f.read())!= -1){
 count++;
}
System.out.println("Total Byte count "+count);
upload_time=(count*8)/256;
System.out.println("Uploading Time "+upload_time+" sec");
f.close();
}

catch(IOException e){

}

}

}
