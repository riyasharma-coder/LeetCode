class Solution {
    public int solve(int i, int[] nums, int[] dp){
        int n = nums.length;

        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        int take = nums[i] + solve(i+2, nums, dp);
        int ntake = solve(i+1, nums, dp);

        dp[i] = Math.max(take, ntake);
        return dp[i];
    }
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);

        return solve(0,nums,dp);
    }
}