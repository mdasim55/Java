// 9.  Given a "2 x n" floor andn tiles of size "2 x 1", count the number of ways to tile the given borad using the 2 x 1 tiles.
// (A tile eitherv can be placed horizontally or vertically).

public class R9_TillingProblem {
    public static int noOfWays(int n) {         // 2 x n (floor size)
        if(n==0 || n==1)  return 1;

        int vertical = noOfWays(n-1);
        int horizontal = noOfWays(n-2);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(noOfWays(n));
    }
}