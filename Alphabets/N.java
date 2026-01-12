
    class N{
    public static void main (String...args){
                  
        for(int i=1; i<=8;i++){
             for(int j=1;j<=8;j++){

             if(j==8||j==1||i==j){
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