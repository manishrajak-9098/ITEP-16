// 12. Write a program showing the concept of Thread Synchronization(Other then classroom example).
// object level
class ShoppingCard{   
    void display(String cardName){
        System.out.print(" [ ");
            try{ Thread.sleep(1000); }catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(cardName);
            try{ Thread.sleep(1000); }catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");
    }
}
class Card extends Thread{
    ShoppingCard sobj;
    String cardName;
    Card(ShoppingCard sobj,String cardName){
        this.sobj=sobj;
        this.cardName=cardName;
        start();
    }
    public void run(){
        synchronized(sobj){
        sobj.display(cardName);
        }
    }
}
class Q12{
    public static void main(String args[]){
        ShoppingCard sobj = new ShoppingCard();
          Card c1 = new Card(sobj,"Debit");
          Card s2 = new Card(sobj,"Credit");
    
    }
}

