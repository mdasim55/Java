// 45. Create a program to print revers an array.

public class Qs_45 {
    public static void main(String[] args) {
        System.out.println("Print the reverse of array:...");
        int[] arr=ArrayUtility.inputArray();
        reverse(arr);
        System.out.print("The reverse array is: ");
        ArrayUtility.display(arr);
    }
    public static void reverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++) {
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
        }
    } 
}
