// Enter 3 numbers from the user & make a function to print the average.....

import java.util.Scanner;

public class Qs1 {
    public static int calculateAvg(int a,int b,int c) {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b and c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=calculateAvg(a, b, c);
        System.out.println("The avg of a, b and c is: "+avg);
    }
}