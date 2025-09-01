import java.util.Scanner;

public class M2_SpiralMatrix {
    // Print spiral matrix....
    public static void spiral(int matrix[][]) {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
            // Print top
            for(int j=startCol;j<=endCol;j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            // Print right..
            for(int i=startRow+1;i<=endRow;i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            // Print bottom1
            for(int j=endCol-1;j>=startCol;j--) {
                System.out.print(matrix[endRow][j]+" ");
            }
            // Print Left...
            for(int i=endCol-1;i>=startCol+1;i--) {
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }       
        System.out.println(); 
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[5][5];
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }    

        spiral(matrix);
        sc.close();    
    }

}
