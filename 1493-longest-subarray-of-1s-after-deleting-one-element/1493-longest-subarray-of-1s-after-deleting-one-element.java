class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int i=0; int j=0;
        int cnt = 0; int k=1;
        int ans = -1;
        while(j<n){
            if(nums[j]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[i]==0){
                    cnt--;
                }
                i++;    
            } 

            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans-1;
    }
}