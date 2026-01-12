class Q{
    public static void main (String args[]){
        for(int i =1; i<=8; i++){
            for(int j=1; j<=8; j++){
                if((j<=6&&i==1)||(i==6&&j<=6)||(j==1&&i<=6)||(j==6&&i<=6)||(i==j&&i>=4&&j>=4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}