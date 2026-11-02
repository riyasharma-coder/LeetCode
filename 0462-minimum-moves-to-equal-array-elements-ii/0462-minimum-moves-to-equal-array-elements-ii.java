class Solution {
    public int minMoves2(int[] nums) {
        
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        int mid = nums[n/2];
        for(int t=0; t<n; t++){
            ans += Math.abs(mid - nums[t]);
        }
        return ans;
    }
}