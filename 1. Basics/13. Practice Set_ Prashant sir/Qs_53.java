// 53. Create a program to find the minimum of two numbers.

import java.util.Scanner;

public class Qs_53 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the sceond number: ");
        int num2=input.nextInt();
        Qs_53 obj=new Qs_53();      // min methods is not static so we creaqting class objects.
        int min=obj.min(num1,num2);
        System.out.println("The minimum number is: "+min);
    }
    public int min(int num1,int num2) {
        // if(num1>num2) {                  // It is the old process.
        //     return num1;
        // } else {
        //     return num2;
        // }
        return num1<num2?num1:num2;
    }

}