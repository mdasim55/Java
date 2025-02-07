// 50. Create a program to find the sum of two diagonal elements.

import java.util.Scanner;

public class Qs_50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("Welcome diagonal sum calculator:...");
        int[][] arr=ArrayUtility.input2DArray();
        int sum=sumOfDiogonal(arr);
        System.out.println("The sum of diogonal is: "+sum);
        input.close();
    }
    public static int sumOfDiogonal(int[][] arr) {
        if(arr.length != arr[0].length) {
            System.out.println("Sorry, you have not entered square 2-D array.");
            return 0;
        }
        int leftSum=sumOfLeftDiogonal(arr);
        int rightSum=sumOfRightDiogonal(arr);
        int sum=leftSum+rightSum;
        if(arr.length%2==1) {
            int midInd=arr.length/2;
            sum=sum-arr[midInd][midInd];
            return sum;
        }
        return sum;
    }
    public static int sumOfLeftDiogonal(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(i==j) {
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumOfRightDiogonal(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if((i+j)==arr.length) {
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
}
