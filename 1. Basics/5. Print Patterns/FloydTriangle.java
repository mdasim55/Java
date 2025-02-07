// Print the pattern.                      m                                  1 
//                                                                            2 3         Floyds Triangle
//                                                                            4 5 6 
//                                                                            7 8 9 10  
//                                                                            11 12 13 14 15 

import java.util.Scanner;

public class FloydTriangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int m=sc.nextInt();
        int number=1;
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}
