// Takes a matrix a a input from the user. Search for a given number x and print indices at which at occurs.

import java.util.Scanner;

public class DDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter the column of column: ");
        int column=sc.nextInt();
        int[][] numbers=new int[row][column];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=column;j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number to be search: ");
        int x=sc.nextInt();
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=column;j++) {
                if(numbers[i][j]==x) {
                    System.out.println(x+" is found at indx no "+i +" and "+j);
                }
            }
        }

    }
}
