/*

*      *
*    * 
*  *
** 
*  *    
*    *  
*      *

   */

class K{
    public static void main (String...args){
   
        for(int i=1; i<=8;i++){
             for(int j=1;j<=8;j++)
             if(j==1||(i==1&&j==8)||(i==2&&j==6||(i==3&&j==4)||(i==4&&j==2)||(i==5&&j==1)||(i==5&&j==3)||(i==6&&j==5)||(i==7&&j==7)||(i==8&&j==8))){
                System.out.print("*");
             }
             else {
             System.out.print(" ");
        }
                System.out.println();
    }
}
}