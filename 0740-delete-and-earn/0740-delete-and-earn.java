class Solution {

    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }

        int[] freq = new int[max+1];
        for(int i=0; i<n; i++){
            freq[nums[i]] += nums[i];
        }

        int[] dp = new int[max+1];
        dp[0] = freq[0];
        if(max>0){
            dp[1] = Math.max(freq[0],freq[1]);
        }
        int ans = 0;
        for(int i=2; i<=max; i++){
            dp[i] = Math.max(freq[i] + dp[i-2], dp[i-1]);
        }

        return dp[max];
    }
}