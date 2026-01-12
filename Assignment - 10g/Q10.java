// 10. Print Output like this : hii  hii hii hii HELLO ii  hii hii hii hello hii  hii hii hii HELLO .... using thread 


class Demo extends Thread {
    @Override
    public void run() {
        try {
             // continuously repeat
                System.out.print("hii ");
                Thread.sleep(1000);
                
                System.out.print("hii ");
                Thread.sleep(1000);
                
                System.out.print("hii ");
                Thread.sleep(1000);
                
                System.out.print("hii ");
                Thread.sleep(1000);
                
                System.out.print("hello ");
                Thread.sleep(1000);

                System.out.print("ii ");
                Thread.sleep(1000);
                System.out.println(); // complete line, next repetition

                System.out.print("hii ");
                Thread.sleep(1000);

                System.out.print("hii ");
                Thread.sleep(1000);

                System.out.print("hii ");
                Thread.sleep(1000);

                System.out.print("hello ");
                Thread.sleep(1000);

                System.out.print("hii ");
                Thread.sleep(1000);
                System.out.println(); // complete line, next repetition

                System.out.print("hii");
                Thread.sleep(1000);

                System.out.print("hii ");
                Thread.sleep(1000);

                System.out.print("hii ");
                Thread.sleep(1000);

                System.out.print("hello ");
                Thread.sleep(1000);

                System.out.println(); 
                
            
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Demo dobj = new Demo();
        dobj.start(); 
    }
}
