// 44. Creating a program to return a new array deleting a specific element.

import java.util.Scanner;

public class Qs_44 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to element deleting of an array: ");
        int[] arr=ArrayUtility.inputArray();
        System.out.print("Please enter the number to be delete: ");
        int num=input.nextInt();
        int[] array=deleteElmt(arr,num);
        System.out.print("Here, the new array is: ");
        ArrayUtility.display(array);
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
    public static int[] deleteElmt(int[] arr,int num) {
        int count=occurance(arr, num);
        if(count==0) {
            return arr;
        }
        int size=arr.length-count;
        int[] newArr=new int[size];
        int i=0,j=0;
        while(i<arr.length) {
            if(arr[i]!=num) {
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
