// 4. Create a program to calculate Compound interset.

import java.util.Scanner;

public class Qs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount of money: ");
        int p=sc.nextInt();
        System.out.print("Enter the time of money is work: ");
        int t=sc.nextInt();
        System.out.print("Enter the interest rate of money: ");
        float r=sc.nextFloat();
        double interest=p*Math.pow((1+r/100),t);
        System.out.println("The simple compound of the given money is: "+interest);
    }
}
