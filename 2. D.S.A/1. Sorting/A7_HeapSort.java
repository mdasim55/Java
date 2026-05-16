import java.util.Arrays;

public class A7_HeapSort {

    public static void heapyfy(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        } 

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapyfy(arr, n, largest);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Create the heap...
        for(int i = n/2 -1; i>=0; i--) {
            heapyfy(arr,n,i);
        }

        // build the sorted array...
        for(int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapyfy(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 10, 3, 5, 1};

        System.out.print("The orginal array is: ");
        System.out.println(Arrays.toString(arr));

        heapSort(arr);

        System.out.print("The sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
