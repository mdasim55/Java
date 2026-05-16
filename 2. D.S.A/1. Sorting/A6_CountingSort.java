import java.util.Arrays;

public class A6_CountingSort {

    public static void countSort(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // Find max element...
        for(int num : arr) {
            max = Math.max(num,max);
        }

        // Size of the count Array..
        int count[] = new int[max+1];

        // Fill the count array...
        for(int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        System.out.print("Count Array:");
        System.out.println(Arrays.toString(count));

        // Build the sorted Array...
        int idx = 0;
        for(int i=0; i<count.length;i++) {
            while(count[i] > 0) {
                arr[idx] = i;
                idx++;
                count[i]--; 
            } 
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        
        System.out.print("The orijinal array is : ");
        System.out.println(Arrays.toString(arr));

        countSort(arr);

        System.out.print("The orijinal array is : ");
        System.out.println(Arrays.toString(arr));
    }
}