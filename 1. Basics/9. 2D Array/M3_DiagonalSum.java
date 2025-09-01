import java.util.Scanner;

public class M3_DiagonalSum {
    public static void diagonalSum(int matrix[][]) {        // Time Complexity: O(n^2)
        int sum=0;
        int n=matrix.length;
        // Calculate primary diagonal sum...
        if(n%2==0) {
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i==j) {
                        sum+=matrix[i][j];
                    }
                    if(i+j==n-1) {
                        sum+=matrix[i][j];
                    }
                }
            }
        } else {        // Calculate secondary diagonal sum...
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(i==j) {
                        sum+=matrix[i][j];
                    }
                    if(i+j==n-1) {
                        sum+=matrix[i][j];
                    }
                }
            }
            sum-=matrix[n/2][n/2];
        }
        System.out.println("The sum is: "+ sum);
    }
    public static void diagonalSum1(int matrix[][]) {        // Time Complexity: O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++) {
            sum+=matrix[i][i];
            if(i != matrix.length-1-i) {
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("The sum is: "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3];
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

        // diagonalSum(matrix);
        diagonalSum1(matrix);
        sc.close();    
    }
}