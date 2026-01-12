class pattern{
    void show(int n ){
        for (int i=0; i<=n; i++){
            for(int j =0; j<=n; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
class Q13D{
    public static void main(String args[]){

    int n =5;
    pattern p = new pattern();
    p.show(n);
    }
}