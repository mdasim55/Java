// 2. Write a function to print the sum of all odd number from 1 to n....

import java.util.Scanner;

public class Qs2 {
        public static int printSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            if(i%2==1) {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        int sum=printSum(n);
        System.out.println("The sum of all odd numberfrom 1 to "+n+" is: "+sum);
    }   
}
