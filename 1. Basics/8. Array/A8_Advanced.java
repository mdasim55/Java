// 1. Print Pairs
// 2. Print sub Arrays...
// 3. Max and min sub Array sum...using Brute Force...
// 4. Max and min sub Array sum...using prefix sum...
// 5. Max and min sub Array sum...using kadane`s algorithm...
// 6. Trapping rainwater...
// 7. Buy and shell Stocks...


public class A8_Advanced {
    // 1. Print pairs
    public static void printPairs(int arr[]) {
        int count = 0;          // Formula: {n*(n-1)}/2;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                System.out.print(arr[i]+","+arr[j]+ " | ");
                count++;
            }
            System.out.println();
        }
        System.out.println("The total pairs of the array is: "+count);
    } 

    // 2. Print sub Arrays...
    public static void printSubArays(int arr[]) {
        int count = 0;          // Formula: {n*(n+1)}/2;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k]+",");
                }
                System.out.print(" || ");
                count++;
            }
            System.out.println();
        }
        System.out.println("The total subArrays of the array is: "+count);
    } 

    // 3. Print maximum and minimum sub Arrays sum...using brute force..
    public static void maxMinSubSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                int currSum = 0;
                for(int k=i;k<=j;k++) {
                    currSum = currSum+arr[k];
                    maxSum = Math.max(maxSum,currSum);
                    minSum = Math.min(minSum,currSum);
                }
            }
        }
        System.out.println("The max subArrays of the array is: "+maxSum);
        System.out.println("The min subArrays of the array is: "+minSum);
    } 

    // 4. Print maximum and minimum sub Arrays sum...using prefix sum..
    public static void maxSubSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                int currSum = (i==0)? prefixSum[j] : prefixSum[j]-prefixSum[i];
                maxSum = Math.max(maxSum,currSum);
            }
        }
        System.out.println("The max subArrays of the array is: "+maxSum);
    }
    
    // 5. Kadane`s algorithm...
    public static void kadane(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            currSum+=arr[i];
            if(currSum<0) {
                currSum = 0; 
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("The max subArrays of the array is: "+maxSum);
    }

    // 6. Trapping Rainwater...
    public static int tapRainWater(int height[]) {
        int n = height.length;

        // step 1: Calculate left max Boundary array...
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i],height[i]);
        }

        // step 2: Calculate right max boundary array...
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) {
            rightMax[i] = Math.max(rightMax[i],height[i]);
        }
        
        // step 3: Calculate trapped rain..
        int trapRain = 0;
        for(int i=0;i<n;i++) {
            // calculate water level..
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // Calculate Trapped Water..
            trapRain += waterLevel-height[i]; 
        }
        return trapRain;
    }

    // 7. Buy and Shell stocks...
    public static int buyAndShellStocks(int nums[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<nums.length;i++) {
            if(buyPrice<nums[i]) {
                int profit = nums[i]-buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = nums[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {4,2,6,1,3};
        int arr3[] = {7,1,5,3,6,4};
        // printPairs(arr);
        // printSubArays(arr);
        // maxMinSubSum(arr);
        // maxSubSum(arr2);
        // kadane(arr2);
        // kadane(arr1);
        // System.out.println(tapRainWater(arr2));

        System.out.println(buyAndShellStocks(arr3));

    }
}