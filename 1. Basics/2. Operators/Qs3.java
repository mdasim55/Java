// 3. Create a program to calculate simple interset.

import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount of money: ");
        int principle=sc.nextInt();
        System.out.print("Enter the time of money is work: ");
        int time=sc.nextInt();
        System.out.print("Enter the interest rate of money: ");
        float rate=sc.nextFloat();
        float interest=(principle*time*rate)/100;
        System.out.println("The simple interest of the given money is: "+interest);
    }
}
