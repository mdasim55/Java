public class DQ1_MergeSort {
    public static void printArray(int arr[]) {
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);        // Merge sort for left part
        mergeSort(arr, mid+1, ei);      // Merge sort for right part
        merge(arr,si,mid,ei);           // Add the 2 sorted array
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i=si;           // Track for left part..
        int j= mid+1;       // Track for right part..
        int k=0;            // Track for tempory array
        while(i<=mid && j<=ei) {
            if(arr[i]<=arr[j]) {
                temp[k]=arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k]=arr[i];
            i++;
            k++;
        } 
        while(j<=ei) {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(i=si,k=0;k<temp.length;i++,k++) {
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,9,7,1,4,2};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}