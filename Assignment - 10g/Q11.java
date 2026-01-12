// 11. Write a program showing the concept of Deadlock(Other then classroom example).



// class A{
//     synchronized public void m1(B obj){
//        obj.x2();
//     }
//     synchronized public void m2(){
//         for(int i = 0; i<5; i++){
//         System.out.println("class A-m2()");
//         }
//     }
// }

// class B{
//     synchronized public void x1(A obj){
//         obj.m2();
//     }
//     synchronized public void x2(){
//         for(int i = 0; i<5; i++){
//         System.out.println("class B-x2()");
//         }
//     }
// }

// class Myclass1 extends Thread{
//     private A a;
//     private B b;

//     public Myclass1(A a , B b){
//         this.a = a;
//         this.b = b;
//     }
//     public void run(){
//         a.m1(b);
//     }
// }

// class Myclass2 extends Thread{
//     private A a;
//     private B b;

//     public Myclass2(A a, B b){
//         this.a = a;
//         this.b = b;
//     }
//     public void run(){
//         b.x1(a);
//     }
// }

// class Q11{
//     public static void main(String args[]){
//     A a = new A();
//     B b = new B();

//     Myclass1 t1 = new Myclass1(a,b);
//     Myclass2 t2 = new Myclass2(a,b);

//     t1.start();
//    t2.start();
// }
// }
public class Q11 {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try { Thread.sleep(100); }
                 catch (InterruptedException e) {
                 }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try { Thread.sleep(100); } 
                catch (InterruptedException e){
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
