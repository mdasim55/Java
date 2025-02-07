// Make a function to add 2 numbers and return the sum...... 

import java.util.Scanner;

public class Sum {
    public static int calculateSum(int a, int b) {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int c=calculateSum(a, b);
        System.out.println("The sum of "+a+" and "+b+" is: "+c);
    }
}
