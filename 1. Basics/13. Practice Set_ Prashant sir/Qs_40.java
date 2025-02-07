// 40. Create a program to find the sum and avearge of all elements in an array.

import java.util.Scanner;

public class Qs_40 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Array sum and average calculator: ...");
        System.out.print("Please, enter the size of the array: ");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("please enter the "+size+" elements: ");
        for(int i=0;i<size;i++) {
            System.out.print("Please enter element no "+(i+1)+" : ");
            arr[i]=input.nextInt();
        }
        long sum=sum(arr);
        float avg=average(arr);
        System.out.println("Sum of the numbers is: "+sum);
        System.out.println("Average of the numbers is: "+avg);
    }
    public static long sum(int[] arr) {
        long sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=i;
        }
        return sum;
    }
    public static float average(int[] arr) {
        long sum=sum(arr);
        return (float) sum/arr.length;
    }
}
