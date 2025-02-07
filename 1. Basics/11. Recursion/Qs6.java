// 6.Print X^n(stack height=n)

import java.util.Scanner;

public class Qs6 {
    public static int calPower(int x,int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int x_pow_m1=calPower(x,n-1);
        int power=x*x_pow_m1;
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x=sc.nextInt();
        System.out.print("Enter the power: ");
        int n=sc.nextInt();
        int power=calPower(x,n);
        System.out.println("The calculation number is: "+power);
    }
}
