class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}