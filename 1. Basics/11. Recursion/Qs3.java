// 3. Print the sum of n natural numbers...

import java.util.Scanner;

public class Qs3 {
    public static void printSum(int i,int n,int sum) {
        if(i==n) {
            sum+=i;
            System.out.println("The value of the sum is: "+sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be calculate sum: ");
        int n=sc.nextInt();
        printSum(1,n,0);
    }
}
