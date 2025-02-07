// Print the pattern.                                                         1 
//                                                                            1 2       Half Pyramid with Numbers
//                                                                            1 2 3
//                                                                            1 2 3 4 
//                                                                            1 2 3 4 5 

import java.util.Scanner;

public class HPwNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print( j+" ");
            }
            System.out.println();
        }

    }
}

