// 43. Create a program to check if the given array is sorted.

import java.util.Scanner;

public class Qs_43 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to checking sorted array: ");
        int[] arr=ArrayUtility.inputArray();
        boolean isSorted1=isIncreasing(arr);             // For increasing order
        boolean isSorted2=isDecresing(arr);             // For decreasing order
        if(isSorted1 || isSorted2) {
            System.out.println("The givrn array is sorted.");
        } else {
            System.out.println("The givrn array is not sorted.");
        }
    }
    public static boolean isDecresing(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]<arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isIncreasing(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
