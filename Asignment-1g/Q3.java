 class Q3 {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        for(String ele : args){
            
            sum = (sum+ Integer.parseInt(ele));
            average = sum/args.length;
        }
    System.out.println(" Sum of all elemrnt : "+sum);
    System.out.println(" Average of  elemrnt : "+average);
    
    }
    
}
