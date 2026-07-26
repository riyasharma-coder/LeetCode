class Solution {
    public int solve(int i, int end, int[] nums, int[] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];

        int take = nums[i] + solve(i+2, end, nums, dp);
        int ntake = solve(i+1, end, nums, dp);

        dp[i] = Math.max(take, ntake);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int r1 = solve(0,n-2,nums,dp);
        Arrays.fill(dp, -1); 
        int r2 = solve(1,n-1,nums,dp);

        return Math.max(r1, r2);
    }
}