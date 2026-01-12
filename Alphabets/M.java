/*

*       *
* *   * *
*  * *  *
*   *   *
*       *
*       *
*       *

   */

class M{
    public static void main (String...args){
                  
        for(int i=1; i<=8;i++){
             for(int j=1;j<=8;j++){

             if(j==8||j==1||(i==2&&j==2)||(i==3&&j==4)||(i==4&&j==5)||(i==3&&j==6)||(i==2&&j==7)){
                System.out.print("*");
            
             }
             else {
             System.out.print(" ");
        }
        }
                System.out.println();
    }
}
}