// Q.3 Write a program to reverse the array.

import java.util.Scanner;
class Q3{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    int arr[] = {2, 1,8, 3, 4};
    int i,j; 
    int temp = 0;

    for(i=arr.length-1,j=0;i>=(arr.length/2);i--,j++){
        for ( j=0; ; j++){

        temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }
    
    for(i=0; i<arr.length; i++){
      System.out.println(arr[i]);
          }
    
      }
      
    }
    
