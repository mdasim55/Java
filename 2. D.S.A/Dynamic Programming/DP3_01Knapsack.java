import java.util.Arrays;

public class DP3_01Knapsack {

    // 1. Using recursion.... O(2^n)
    public static int knapsack(int val[], int wt[], int w, int n) {
        if(n==0 || w==0)  return 0;

        if(wt[n-1]<=w) {        // Valid case..
            // include...
            int ans1 = val[n-1]+knapsack(val,wt,w-wt[n-1],n-1);
            // exclude...
            int ans2 = knapsack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        } else {            // Invalid case...
            // exclude...
            return knapsack(val,wt,w,n-1);
        }
    }

    // 2. Using Memoization.... O(n*w)
    public static int knapsack1(int val[], int wt[], int w, int n, int dp[][]) {
        if(n==0 || w==0)  return 0;

        if(dp[n][w]!=-1)  return dp[n][w];

        if(wt[n-1]<=w) {        // Valid case..
            // include...
            int ans1 = val[n-1]+knapsack(val,wt,w-wt[n-1],n-1);
            // exclude...
            int ans2 = knapsack(val,wt,w,n-1);
            dp[n][w] = Math.max(ans1,ans2);
            return dp[n][w];
        } else {            // Invalid case...
            // exclude...
            dp[n][w] = knapsack(val,wt,w,n-1);
            return dp[n][w];
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];

        for(int i=0;i<=val.length;i++) {
            for(int j=0;j<=w;j++) {
                dp[i][j] = -1;
            }
        }
        Arrays.fill(dp,-1);
        //     System.out.println(knapsack(val,wt,w,val.length));

        //     System.out.println(knapsack1(val,wt,w,val.length,dp));

        for(int i=0;i<=val.length;i++) {
            for(int j=0;j<=w;j++) {
                System.out.println(dp[i][j]);
            }
        }
    }
}
