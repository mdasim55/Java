// Print the pattern.                                                         * * * * * * * 
//                                                                          * * * * * * *      Solid Rombous
//                                                                        * * * * * * *
//                                                                      * * * * * * *  
//                                                                    * * * * * * *

import java.util.Scanner;

public class SolidRombous {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int n=sc.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=m-i;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
