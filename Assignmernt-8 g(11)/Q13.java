// 13.Create class Plot with data members length and breadth. Create constructor. Create member functions
// a)float calcArea()->to return area of plot
// b)Plot compare(Plot p)-> which takes Object of Plot class as argument and return 0 
// if area of argument object is same as current object,
//  1 if current object area is > then argument object and -1 if area of argument object is > then current object.
 
import java.util.Scanner;
class Plot{
    float l,b;
    Plot(float l,float b){
        this.l=l;
        this.b=b;
    }
    
    float calcArea(){
        
        return l*b;
    }
    int compare(Plot p2){
        float currentArea=this.calcArea();
        float otherArea=p.calcArea();
        if(currentArea > otherArea){

            return 1;
        }
        else if(currentArea < otherArea){

            return -1;
        }
        else{
            return 0;
        }
    }

}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        Plot p1=new Plot(5.45f,6.54f);
        Plot p2=new Plot(7.543f,4.54f);
        p1.calcArea();
        p2.calcArea();

        int res=p1.compare(p2);
        if(res==1){
            System.out.println("\nCurrent area is greater than another area.\n");
        }
        else if(res==-1){
            System.out.println("\nCurrent area is greater than another area.\n");
        }
        else{
            System.out.println("\nBoth are equal.\n");
 }
}
}
