class Solution {
    public boolean solve(int[] nums, int m, int k, int mid){
        int count = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=mid){
                count++;
                if(count==k){
                    ans += 1;
                    count = 0;
                }
            }else{
                count = 0;
            }    
        }
        return ans>=m;
    }
    public int minDays(int[] nums, int m, int k) {
        int n = nums.length;
        if ((long)m * k > nums.length)
        return -1;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i=0; i<n ; i++){
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(solve(nums, m, k, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}