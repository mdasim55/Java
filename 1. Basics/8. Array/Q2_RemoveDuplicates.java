// 2. Remove duplicates elements in an array.. 

import java.util.Scanner;

public class Q2_RemoveDuplicates {
        public static void printArray(int arr[]) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void sortArray(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

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
        sortArray(arr);
        printArray(arr);
        sc.close();

    }
}
