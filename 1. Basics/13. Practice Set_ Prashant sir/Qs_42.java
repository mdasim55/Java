// 42. Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

public class Qs_42 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to maximum and minimum element of an array: ");
        int[] arr=ArrayUtility.inputArray();
        int maximum=maximum(arr);
        int minimum=minimum(arr);
        System.out.println("The maximum element of the array is: "+maximum);
        System.out.println("The minimum element of the array is: "+minimum);
    }
    public static int maximum(int[] arr)  {
        if(arr.length==0) {
            return 0;
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr)  {
        if(arr.length==0) {
            return 0;
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
}
