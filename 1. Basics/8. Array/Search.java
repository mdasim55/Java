// Take an array as input from user. Search for a given number x and print the index at which it occurs...

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be search: ");
        int x=sc.nextInt();
        for(int i=0;i<size;i++) {
            if(arr[i]==x) {
                System.out.println("The index of x is: "+ i);
            }
        }
        System.out.println(x+" is not found in the array.");

    }    
}
