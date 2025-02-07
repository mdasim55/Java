// 5. Create a program to convert Fahrenhite to celcius.

import java.util.Scanner;

public class Qs5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in farenhite: ");
        float f=input.nextFloat();
        float celcius=(f-32)*5/9;
        System.out.println("The temperature in celcius is: "+celcius); 
    }    
}
