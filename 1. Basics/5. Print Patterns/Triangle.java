// Print the pattern.                                                         1 
//                                                                            0 1       0-1 Triangle
//                                                                            1 0 1
//                                                                            0 1 0 1 
//                                                                            1 0 1 0 1  

import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.err.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
