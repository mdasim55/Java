import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class A4_InBuiltSort {
    public static void printArray(Integer arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        Integer arr[]=new Integer[size];
        System.out.println("Enter the "+size+" elements of the array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        } 
        // Type 1: Normal Sort                         // Time complexity: 
        // Arrays.sort(arr);                           // Best Case: O(n)
        // printArray(arr);                            // Average/Worst Case: O(n log n)
        
        // Type 2: Sort any part of array...
        // Arrays.sort(arr,0,5);       // Arrays.sort(arr,startIndex,ending index+1);
        // printArray(arr);

        // Type 3: Sort in decending Order...
        // Arrays.sort(arr,Collections.reverseOrder());
        // printArray(arr);

        // Type 4: Sort in decending Order...Sort any part of array...
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        printArray(arr);

        sc.close();
    }
}
