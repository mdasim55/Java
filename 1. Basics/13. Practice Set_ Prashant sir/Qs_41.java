// 41. Create a program to find number of occurances of an element in an array.

import java.util.Scanner;

public class Qs_41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Occurance of an array: ");
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Please enter the number to be search: ");
        int num=input.nextInt();
        int count=occurance(arr,num);
        System.out.println("Your element "+num+" was found "+count+" times in the array.");
    }
    public static int occurance(int[] arr, int num) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                count++;
            }
        }
        return count;
    }
}
