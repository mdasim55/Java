// 56. Create a program to Based on the student`s score, catagorize as "High", "Moderate" and "Low" using the ternary ooperator. 
//     High scores > 80, Moderate for 50-80, low for < 50.

import java.util.Scanner;

public class Qs_56 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome garde calculator.");
        System.out.print("Enter the marks: ");
        int marks=input.nextInt();
        String grade=marks>=50 ?(marks>=80?"High":"Moderate") : "Low" ;
        System.out.println("The marks grade is: "+grade);
    }
}
