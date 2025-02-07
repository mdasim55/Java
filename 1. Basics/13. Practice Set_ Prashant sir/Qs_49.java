// 49. Create a program to do sum and average of all element in a 2-D array.

import java.util.Scanner;

public class Qs_49 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("Welcome to sum and average calculator:...");
        int[][] arr=ArrayUtility.input2DArray();
        long sum=calculateSum(arr);
        float avg=calculateAvg(arr);
        System.out.println("The sum of the all element in the 2-D array is: "+sum);
        System.out.println("The average of the all element in the 2-D array is: "+avg);
    }
    public static long calculateSum(int[][] arr) {
        long sum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                sum+=arr[i][j];
                System.out.println("The sum is: "+sum);
            }
        }
        return sum;
    }
    public static float calculateAvg(int[][] arr) {
        int rows=arr.length;
        int columns=arr[0].length;
        int size=rows*columns;
        float avg=(float)calculateSum(arr)/size;
        return avg;
    }
}
