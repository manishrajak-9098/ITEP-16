class ThreadClass extends Thread {
    int n;

    ThreadClass(int n) {
        this.n = n;
    }

    public void run() {
        try {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    Thread.sleep(1000); // 1 second delay 
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Q8{
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass(5); 
        t.start(); 
    }
}
