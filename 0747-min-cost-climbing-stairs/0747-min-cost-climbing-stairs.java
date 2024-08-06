class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp= new int[n+1];
        if(n<2)
          return 0;
        dp[n]=cost[n-1];
        dp[n-1]=cost[n-2];
        for(int i=n-2;i>0;i--)
        {
            int a=cost[i-1]+Math.min(dp[i+1],dp[i+2]);
            // int b=dp[i+1];
            dp[i]=a;//Math.min(a,b);
        }
        dp[0]=Math.min(dp[1],dp[2]);
        return dp[0];
    }
    // public int helper(int[] cost,int index)
    // {
    //     if(index==cost.length || index==cost.length-1)
    //        return 0;
        
    // }
}