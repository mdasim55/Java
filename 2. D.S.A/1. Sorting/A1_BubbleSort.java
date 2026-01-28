import java.util.Scanner;

public class A1_BubbleSort {
    // Normal code .. Time Complexity: O(n^2)
    public static void A1_BubbleSort1(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    // Adapted code... if already sorted then time Complexity: O(n) otherwise O(n^2)
    public static void BubbleSort2(int arr[]) {
        boolean isSorted;
        for(int i=0;i<arr.length-1;i++) {
            isSorted=true;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted) {
                System.out.println("The given array is already sorted.");
                return;
            }
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the "+size+" elements of the array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        // BubbleSort1(arr);
        BubbleSort2(arr);
        printArray(arr);
        sc.close();
    }
}