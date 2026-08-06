class Solution {
    public boolean solve(int i, int[] nums,int tar, Boolean[][] dp){
        //base case
        int n = nums.length;
        if(dp[i][tar]!=null) return dp[i][tar];
        if(tar==0) return true;
        if(i>=n) return false;
       
        boolean take = false;
        if (nums[i] <= tar) {
            take = solve(i + 1, nums, tar - nums[i], dp);
        }
        boolean skip = solve(i+1, nums, tar, dp);

        dp[i][tar] = take||skip;
        return dp[i][tar];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for(int a : nums){
            sum += a;
        }

        Boolean[][] dp = new Boolean[n+1][sum/2 + 1];
        if(sum%2!=0){
            return false;
        }
        else{
            return solve(0, nums,sum/2, dp);
        }
        
    }
}