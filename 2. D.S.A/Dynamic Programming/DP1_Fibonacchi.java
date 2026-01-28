
public class DP1_Fibonacchi {

    // Using Recursion ....O(2^n)
    public static int fib1(int n) {
        if(n==1 || n==0)  return n;
        
        return fib1(n-1)+fib1(n-2);
    }
    // Using Memoization....O(n)
    public static int fib2(int n, int dp[]) {
        if(n==1 || n==0)  return n;
        if(dp[n]!=0) {              // fib(n) is already calculated...
            return dp[n];
        }
        dp[n] =  fib2(n-1,dp)+fib2(n-2,dp);
        return dp[n];
    }

    // Using Tabulation...(Iterative)....O(n)
    public static int fib3(int n) {
        // Initialization...
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];               // [0,0,0,0,0,0]

        // System.out.println(fib1(n));

        // System.out.println(fib2(n,dp));

        System.out.println(fib2(0,dp));
        System.out.println(fib3(1));
        System.out.println(fib3(2));
        System.out.println(fib3(3));
        System.out.println(fib3(4));
        System.out.println(fib3(5));
    }
}