import java.util.Scanner;

public class M1_Implementation {
    // Saerch any elements in the matrix....
    public static boolean search(int matrix[][], int key) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==key) {
                    System.out.println("The "+key+" is found at a shell ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
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

        search(matrix, 5);

        sc.close();
    }    
}
