// Search in Roated Sorted Array...

// input: sorted, roated array with distinct numbers(in accending order). It is roated at a pivot point.
// Find the index of given element.  
// Array = {4,5,6,7,0,1,2},   target = 0

// output: 4

public class DQ3_Questions {
    public static int search(int arr[], int target, int si, int ei) {
        if(si>ei) {
            return -1;
        }
        int mid = si+(ei-si)/2;
        // Best case
        if(arr[mid]==target) {
            return mid;
        }
        // If mid lies on L1...
        if(si<mid) {
            // Search left of the mid
            if(arr[si]<=target && target<arr[mid]) {
                return search(arr, target, si, mid-1);
            } else {     // Search right of the mid
                return search(arr, target, mid+1, ei);
            }
        } else {         // If mid lies on L2...
            // Search right of the mid
            if(arr[mid]<target && target<=arr[ei]) {
                return search(arr, target, mid+1,ei);
            } else {     // Search left of the mid
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target=0;
        int idx=search(arr,target,0,arr.length-1);
        System.out.println(idx);
    }
}
