class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int k = 1;

        int count = 0;
        int ans = 0;
        for(int j=0; j<n; j++){
            if(nums[j] == 0) {
                count++;
            }
            if(count <= k) {
                ans = Math.max(ans, j - i+1 );
            }
            while(count > k) {
                if(nums[i]==0){
                    count -= 1;
                }
                i++;
            }
        }
        return ans-1;
    }
}
