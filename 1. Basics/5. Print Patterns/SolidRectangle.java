// Print the pattern.                                                         * * * * * * *
//                                                                            * * * * * * *
//                                                                            * * * * * * *
//                                                                            * * * * * * *

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int n=sc.nextInt();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
