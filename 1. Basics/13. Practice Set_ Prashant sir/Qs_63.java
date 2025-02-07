// 63. Create a program using for each loop to find the maximum value in an integer array.

import java.util.Scanner;

public class Qs_63 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to find maximum value calculator: ");
        int[] arr=ArrayUtility.inputArray();
        int max=calculateMax(arr);
        System.out.println("The maximum of the array is: "+max);
        input.close();
    }
    public static int calculateMax(int[] arr) {
        int max=arr[0];
        for(int num: arr) {
            if(num>max) {
                max=num;
            }
        }
        return max;
    }
}