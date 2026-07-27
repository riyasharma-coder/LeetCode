class Solution {
    public int solve(int i, int[] freq, int[] dp){
        if(i>=freq.length) return 0;
        if(dp[i]!=-1) return dp[i];

        int take = freq[i]*i + solve(i + 2, freq, dp);
        int notTake = solve(i + 1, freq, dp);

        dp[i] = Math.max(take, notTake);
        return dp[i];
    }
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;

        int max = 0;
        for(int num : nums){
            max = Math.max(num, max);
        }
        int[] freq = new int[max+1];
        int[] dp = new int[max+1];
        Arrays.fill(dp, -1);

        for(int num : nums){
            freq[num]++;
        }
    
        return solve(0, freq, dp);
    }
}