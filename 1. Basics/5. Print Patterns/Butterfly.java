// Print the pattern.                                                        *             *        
//                                                                           * *         * * 
//                                                                           * * *     * * *
//                                                                           * * * * * * * * 
//                                                                           * * * * * * * * 
//                                                                           * * *     * * * 
//                                                                           * *         * *
//                                                                           *             *

import java.util.Scanner;

public class Butterfly {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(m-i);j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(m-i);j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
