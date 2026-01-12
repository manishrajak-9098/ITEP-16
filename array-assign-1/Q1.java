//1. WAP to Enter n element in array and print array


import java.util.Scanner;
class Q1{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no. of element to be stored or size");
    int n = sc.nextInt();
    int i;

    int arr[] = new int[n]; 
    for(i=0;i<n;i++){
        System.out.println("enter " + (i+1) + " element");
        arr[i] = sc.nextInt();
    }
    System.out.println("given data");
     
     for (i=0;i<n;i++){
        System.out.print(" " +arr[i]);   

           }
        }
     }
