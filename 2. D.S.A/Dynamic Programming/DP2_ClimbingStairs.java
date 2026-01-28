import java.util.Arrays;

public class DP2_ClimbingStairs {

    // 1. Using Recursion...o(2^n)
    public static int ways(int n) {
        if(n==0) return 1;
        if(n<0) return 0;

        return ways(n-1)+ways(n-2);
    } 

    // 2. Using Memoization...O(n)
    public static int ways1(int n, int dp[]) {
        if(n==0) return 1;
        if(n<0) return 0;

        if(dp[n]!=-1) return dp[n];
        dp[n] = ways(n-1)+ways(n-2); 
        return dp[n];
    }
    
    // 3.Using Tabulation...(Iterative)....O(n)
    public static int ways2(int n) {
        // Initialization...
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(ways(n));

        System.out.println(ways1(n,dp));

        System.out.println(ways(n));
    }    
}
