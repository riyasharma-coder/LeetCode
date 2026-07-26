class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;

        int ans = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            buy = Math.min(nums[i],buy);
            ans = Math.max(ans, nums[i]-buy);
        }
        return ans;
    }
}