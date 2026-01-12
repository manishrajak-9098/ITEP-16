// 33. Create a class MathOperation containing method ‘multiply’ to calculate
// multiplication of following arguments.
// a. two integers
// b. three float
// c. all elements of array
// d. one double and one integer
class MathOperation{
    int sum;

    int multiply(int a, int b){  //int wale
        return sum = a*b;
    }

    float multiply(float x, float y, float z){
        return x*y*z;
    }
    double multiply(int a, double b){
        return a*b;
    }

    int multiply(int arr[]){
        int result =1;
        for(int i=0; i<arr.length; i++){
            result = result*arr[i];
        }
        return result;
    }


}

class Q33{
    public static void main(String args[]){

        MathOperation obj = new MathOperation();
        obj.multiply(3, 5);
        System.out.println("\nMUltiply of two number integer (3,5) : "+obj.sum);
        
        System.out.println("\nMUltiply of three number float(3f ,5f, 10f) : "+obj.multiply(3f, 5f,10f));

        System.out.println("\nMUltiply of two number int double(3 ,7.0) : "+obj.multiply(3, 7.0));

        int arr[] = {1, 2, 3, 4};
        System.out.println("\nMUltiply of array number {1 ,2, 3, 4} : "+obj.multiply(arr));
        
        

    }
    }