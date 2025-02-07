// 36. Create a program to print the fibonacchi series up to a certain number.
//    Fibonacchi series is: 0, 1, 1 ,2, 3, 5, 8, 13, 31, 34, 55, 89.
import java.util.Scanner;

public class Qs_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacchi series calculator...");
        System.out.print("Enter the number upto which series has to be printed: ");
        int n= input.nextInt();
        calculateFibo(n);
    }
    public static void calculateFibo(int num) {
        int num1=0,num2=1,num3;
        if(num<0) {
            System.out.println("You have entered wrong number.");
            return;
        }
        System.out.println("The fibonacchi series upto "+num+" is: ");
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1");
        //System.out.print(num1+" "+num2);
        while((num1+num2)<=num) {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }    
}

