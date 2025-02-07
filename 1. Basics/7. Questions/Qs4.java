// 4. Write a function that takes in the radious as  input and returns the circumference of a circle.... 

import java.util.Scanner;

public class Qs4 {
    public static double calculateCircle(double r) {
        double circlem=2*3.14*r;
        return circlem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        int r=sc.nextInt();
        double circlem=calculateCircle(r);
        System.out.println("The circuference of the circle  is: "+circlem);
    }   
}
