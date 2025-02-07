// 3.  Write a program that allows you to keep accessing an array until a valid index is given. If max retires 
//     exceed 5 print "Errors".
// 4. Modify Program in Qs_3 to throw a coustom exception if max retries are reached.
// 5. Wrap the program in Qs_3 inside a method which throws your coustom exception.

import java.util.Scanner;

class myclass extends Exception {

}

public class Qs_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int index;
        int i=0;
        while(i<5) {
            try {
                System.out.print("Enter the value of array index: ");
                index=input.nextInt();
                System.out.println("The value of arr[index] is: "+arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("You have entered in valid index.");
                System.out.println("Please enter the valid index.");
                i++;
            }
        } 
        if(i==5) {
            System.out.println("Error.");
            System.out.println("Sorry, you lost the opporchunity.");
        }
        input.close();
    }
}