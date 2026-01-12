class R{
    public static void main (String argd[]){
        for(int i =1; i<=6; i++){
            for(int j =1; j<=6; j++){
                if(j==1||(i==1&&j<=4)||(i==4&&j<=4)||(j==4&&i<=4)||(i>=4&&i==j)){
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