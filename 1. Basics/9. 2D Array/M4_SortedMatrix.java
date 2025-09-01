public class M4_SortedMatrix {
    // Time Complexity: O(m+n)
    public static void sortedSearch(int matrix[][], int key) {
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<=matrix.length-1) {
            if(key>matrix[row][col]) {
                col++;
            } else if(key<matrix[row][col]) {
                row--;
            } else {
                System.out.println("The "+key+" is found at a shell ("+row+","+col+")");
                return;
            }
        }
        System.out.println("The key is not found in the matrix.");
    }
    public static void main(String[] args) {
        int matrix[][]={ {10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50} };

        sortedSearch(matrix, 37);        
    }    
}
