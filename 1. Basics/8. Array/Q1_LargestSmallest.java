// 1. Find the largest and smallest element in an array...

import java.util.Scanner;

public class Q1_LargestSmallest {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int largestNumber(int arr[]) {
        int largest = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int smallestNumber(int arr[]) {
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < smallest) {
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("The entered array is: ");
        printArray(arr);
        System.out.println("The largest element of the array is: "+largestNumber(arr));
        System.out.println("The smallest element of the array is: "+smallestNumber(arr));

        sc.close();

    }
}