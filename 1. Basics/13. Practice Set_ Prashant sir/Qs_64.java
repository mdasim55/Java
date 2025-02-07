// 64. create a program using for each loop to the occurance of the specific element in an array.

import java.util.Scanner;

public class Qs_64 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to finding occurances: ");
        int[] arr=ArrayUtility.inputArray();
        System.out.print("Enter the number to be find occurance: ");
        System.out.println("Iam right hare.");
        int num=input.nextInt();
        int occure=countOccurances(arr,num);
        System.out.println("Your element "+num+" was found  "+occure+" times.");
        input.close();
    }    
    public static int countOccurances(int[] arr,int num) {
        int occure=0;
        for (int i : arr) {
            if(i==num) {
                occure++;
            }
        }
        return occure;
    }

}
