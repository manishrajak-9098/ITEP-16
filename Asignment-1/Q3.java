class Q3{
    public static void main(String[] args)
{ int l_of_tile=13;
    int b_of_tile=7;
    int l_of_reason=520;
    int b_of_reason=140;
    int aera_of_reason, aera_of_one_tile;
     aera_of_one_tile=l_of_tile*b_of_tile;
     aera_of_reason=l_of_reason*b_of_reason;
    int total_tile=aera_of_reason/aera_of_one_tile;
    System.out.println("total_tile "+total_tile);
}
}