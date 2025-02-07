// 47. Create a program to merge two sorted array.

public class Qs_47 {
    public static void main(String[] args) {
        System.out.println("Merge two sorted Array: ");
        System.out.println("Enter the first sorted array: ");
        int[] arr1=ArrayUtility.inputArray();
        System.out.println("Enter the second sorted array: ");
        int[] arr2=ArrayUtility.inputArray();
        int[] arr=mergeArr(arr1,arr2);
        System.out.print("The new sorted array is: ");
        ArrayUtility.display(arr);
    }   
    public static int[] mergeArr(int[] arr1,int[] arr2) {
        int newSize=arr1.length+arr2.length;
        int[] newArr= new int[newSize];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length) {             //  while(i<arr1.length || j<arr2.length) {
            if(arr1[i]<arr2[j]) {                           //      if(j==arr2.lenght || (i<arr1.length && arr[i]<arr[2])) {
                newArr[k]=arr1[i];                          //          newArr[k]=arr1[i];
                i++;                                        //          i++;
                k++;                                        //          k++;
            } else {                                        //       } else {
                newArr[k]=arr2[j];                          //          newArr[k]=arr2[j];
                j++;                                        //          j++;
                k++;                                        //          k++;
            }                                               //   }
        }
        while(i<arr1.length) {
            newArr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
            newArr[k]=arr2[j];
            j++;
            k++;
        }
        return newArr;
    }
}
