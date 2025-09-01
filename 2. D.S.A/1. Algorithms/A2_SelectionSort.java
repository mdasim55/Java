import java.util.Scanner;

public class A2_SelectionSort {
    public static void selectionSort1(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
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
        selectionSort1(arr);
        printArray(arr);
        sc.close();
    }
}
