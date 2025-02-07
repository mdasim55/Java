// Print the sum of N  natural numbers....

import java.util.Scanner;

public class Qs {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of natural numbers: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++) {
            sum=sum+i;
            System.out.println(sum);  
        }
    }
}
