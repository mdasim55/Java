// 48. Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class Qs_48 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("Search an in 2-D array:...");
        int[][] arr=ArrayUtility.input2DArray();
        System.out.print("Enter the element to be search: ");
        int num=input.nextInt();
        boolean isFound=isSearchNum(arr,num);
        if(isFound) {
            int i=iIndex(arr, num);
            int j=jIndex(arr, num);
            System.out.println("The element is found in the array.");
            System.out.println("the position element is: row: "+(i+1)+", column: "+(j+1));
        } else {
            System.out.println("The element is not found in the array.");
        }
    }
    public static boolean isSearchNum(int[][] arr,int num) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i][j]==num) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int iIndex(int[][] arr,int num) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i][j]==num) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static int jIndex(int[][] arr,int num) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i][j]==num) {
                    return j;
                }
            }
        }
        return -1;
    }
}
