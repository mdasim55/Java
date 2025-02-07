// 3. Find the factorial of a number....... 

import java.util.Scanner;

public class Fact {
    public static void factorial(int n) {;'/'
        int fact=1;
        if(n<0) {
            System.out.println("You have entered negative number.");
            return;
        }
        for(int i=n;i>=1;i--) {
            fact=fact*i;
        }
        System.out.println("The factorial of the "+n+" is: "+fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n=sc.nextInt();
        factorial(n);
    }
}
