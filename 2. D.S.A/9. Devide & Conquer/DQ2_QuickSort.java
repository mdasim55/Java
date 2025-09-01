public class DQ2_QuickSort {
    public static void printArray(int arr[]) {
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;                 // To make place for element smaller than pivot...
        for(int j=si;j<ei;j++) {
            if(arr[j]<pivot) {
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,9,7,1,4,2};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
