public class A5_CountSort {
    public static void countSort(int arr[]) {
        // 1. Find the largest element in the array...
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest=Math.max(arr[i],largest);
        }
        // 2. Create the frequency array..
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        // 3. Sort the elements...
        int j=0;
        for(int i=0;i<count.length;i++) {
            while(count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
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
        int arr[]={7,1,6,2,5,3,4};
        countSort(arr);
        printArray(arr);
    }   
}
